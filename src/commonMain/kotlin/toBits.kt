/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package gay.pyrrha.kflags

import kotlin.experimental.or
import kotlin.js.JsName
import kotlin.jvm.JvmName

/**
 * Obtain the binary value of the [Byte] bitfield.
 * @return binary [Byte] value.
 */
@JvmName("toByteBits")
@JsName("toByteBits")
public fun Set<Flag<Byte>>?.toBits(): Byte = this?.fold(0.toByte()) { acc, flag ->
    acc or flag.value
} ?: 0.toByte()

/**
 * Obtain the binary value of the [UByte] bitfield.
 * @return binary [UByte] value.
 */
@JvmName("toUByteBits")
@JsName("toUByteBits")
public fun Set<Flag<UByte>>?.toBits(): UByte = this?.fold(0.toUByte()) { acc, flag ->
    acc or flag.value
} ?: 0.toUByte()

/**
 * Obtain the binary value of the [Short] bitfield.
 * @return binary [Short] value.
 */
@JvmName("toShortBits")
@JsName("toShortBits")
public fun Set<Flag<Short>>?.toBits(): Short = this?.fold(0.toShort()) { acc, flag ->
    acc or flag.value
} ?: 0.toShort()

/**
 * Obtain the binary value of the [UShort] bitfield.
 * @return binary [UShort] value.
 */
@JvmName("toUShortBits")
@JsName("toUShortBits")
public fun Set<Flag<UShort>>?.toBits(): UShort = this?.fold(0.toUShort()) { acc, flag ->
    acc or flag.value
} ?: 0.toUShort()

/**
 * Obtain the binary value of the [Int] bitfield.
 * @return binary [Int] value.
 */
@JvmName("toIntBits")
@JsName("toIntBits")
public fun Set<Flag<Int>>?.toBits(): Int = this?.fold(0) { acc, flag ->
    acc or flag.value
} ?: 0

/**
 * Obtain the binary value of the [UInt] bitfield.
 * @return binary [UInt] value.
 */
@JvmName("toUIntBits")
@JsName("toUIntBits")
public fun Set<Flag<UInt>>?.toBits(): UInt = this?.fold(0u) { acc, flag ->
    acc or flag.value
} ?: 0u

/**
 * Obtain the binary value of the [Long] bitfield.
 * @return binary [Long] value.
 */
@JvmName("toLongBits")
@JsName("toLongBits")
public fun Set<Flag<Long>>?.toBits(): Long = this?.fold(0L) { acc, flag ->
    acc or flag.value
} ?: 0L

/**
 * Obtain the binary value of the [ULong] bitfield.
 * @return binary [ULong] value.
 */
@JvmName("toULongBits")
@JsName("toULongBits")
public fun Set<Flag<ULong>>?.toBits(): ULong = this?.fold(0uL) { acc, flag ->
    acc or flag.value
} ?: 0uL
