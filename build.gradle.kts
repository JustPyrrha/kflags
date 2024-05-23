import org.gradle.api.tasks.testing.logging.TestExceptionFormat
import org.gradle.jvm.tasks.Jar
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.JvmTarget
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.android)
    alias(libs.plugins.changelog)
    alias(libs.plugins.dokka)
    alias(libs.plugins.githooks)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.licenser)

    `maven-publish`
}

group = "gay.pyrrha"
version = "1.0.0"

repositories {
    mavenCentral()
}

tasks {
    withType<KotlinCompile> {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }
    }
    withType<Test> {
        useJUnitPlatform()
        testLogging {
            showStandardStreams = true
            showExceptions = true
            exceptionFormat = TestExceptionFormat.FULL
        }
    }
    withType<Jar> {
        metaInf.with(
            copySpec {
                from("${project.rootDir}/LICENSE")
            }
        )
    }
    val dokkaJar by registering(Jar::class) {
        from(dokkaHtml)
        dependsOn(dokkaHtml)
        archiveClassifier = "javadoc"
    }
}

license {
    rule(file("HEADER"))
    include("**/*.kt")
}

@OptIn(ExperimentalKotlinGradlePluginApi::class)
kotlin {
    explicitApi()

    compilerOptions {
        apiVersion = KotlinVersion.KOTLIN_2_0
        languageVersion = KotlinVersion.KOTLIN_2_0
    }

    jvm {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }
    }

    js {
        browser {
            testTask {
                useKarma {
                    useFirefoxHeadless()
                    useChromeHeadless()
                }
            }
        }
    }

    @OptIn(ExperimentalWasmDsl::class)
    wasmJs {
        browser {
            testTask {
                useKarma {
                    useFirefoxHeadless()
                    useChromeHeadless()
                }
            }
        }
    }

    androidTarget {
        compilerOptions {
            jvmTarget = JvmTarget.JVM_1_8
        }

        publishLibraryVariants("release", "debug")
    }

    val linuxTargets = listOf(
        linuxArm64(),
        linuxX64(),
        mingwX64(),
        androidNativeX64(),
        androidNativeX86(),
        androidNativeArm64(),
        androidNativeArm32(),
    )
    val darwinTargets = listOf(
        macosArm64(),
        macosX64(),
        iosArm64(),
        iosSimulatorArm64(),
        iosX64(),
        watchosArm64(),
        watchosSimulatorArm64(),
        watchosX64(),
        tvosArm64(),
        tvosSimulatorArm64(),
        tvosX64()
    )

    sourceSets {
        val commonMain by getting { }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }

        val javaMain by creating {
            dependsOn(commonMain)
        }

        val jvmMain by getting {
            dependsOn(javaMain)
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val androidMain by getting {
            dependsOn(javaMain)
        }

        val androidUnitTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val directMain by creating {
            dependsOn(commonMain)
        }

        val jsMain by getting {
            dependsOn(directMain)
        }

        val jsTest by getting {
            dependencies {
                implementation(kotlin("test-js"))
            }
        }

        val wasmJsMain by getting {
            dependsOn(directMain)
        }

        val wasmJsTest by getting {
            dependencies {
                implementation(kotlin("test-wasm-js"))
            }
        }

        val nativeMain by creating {
            dependsOn(directMain)
        }

        val nativeTest by creating {
            dependencies {
                implementation(kotlin("test"))
            }
        }

        val linuxMain by creating {
            dependsOn(nativeMain)
        }

        val darwinMain by creating {
            dependsOn(nativeMain)
        }

        linuxTargets.forEach {
            getByName("${it.targetName}Main") {
                dependsOn(linuxMain)
            }
        }

        darwinTargets.forEach {
            getByName("${it.targetName}Main") {
                dependsOn(darwinMain)
            }
        }
    }
}

android {
    compileSdk = 31
    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    defaultConfig {
        minSdk = 21
    }
    @Suppress("UnstableApiUsage")
    testOptions {
        unitTests.isReturnDefaultValues = true
    }
    namespace = "gay.pyrrha.kflags"
}

gitHooks {
    setHooks(mapOf("pre-commit" to "build test checkLicenses"))
}

publishing {
    publications.withType<MavenPublication> {
        pom {
            name = "kflags"
            description = "kflags $version - Bitflags for Kotlin Multiplatform"
            url = "https://github.com/JustPyrrha/bitflags"
            licenses {
                license {
                    name = "Mozilla Public License v2.0"
                    url = "https://www.mozilla.org/en-US/MPL/2.0/"
                }
            }
            developers {
                developer {
                    name = "Pyrrha Wills"
                    id = "JustPyrrha"
                    email = "contact@pyrrha.gay"
                }
            }
            scm {
                connection = "scm:git:git://github.com/JustPyrrha/kflags.git"
                developerConnection = "scm:git:ssh://github.com:JustPyrrha/kflags.git"
                url = "https://github.com/JustPyrrha/kflags/tree/main"
            }
        }
        artifact(tasks["dokkaJar"])
    }

    repositories {
        maven("s3://maven.pyrrha.gay/releases") {
            credentials(AwsCredentials::class) {
                accessKey = System.getenv("AWS_ACCESS_KEY_ID")
                secretKey = System.getenv("AWS_SECRET_ACCESS_KEY")
            }
        }
    }
}
