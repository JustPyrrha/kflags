rootProject.name = "kflags"

pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        val libs by creating {
            from(files("libs.versions.toml"))
        }
    }
}
