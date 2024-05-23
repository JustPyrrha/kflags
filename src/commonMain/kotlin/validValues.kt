/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package gay.pyrrha.kflags

import kotlin.js.JsName
import kotlin.jvm.JvmName

/**
 * Obtain all discrete valid values for the [UByte] bitfield.
 * @return [UByte] set with all the valid bitfield values.
 */
@JvmName("validUByteValues")
@JsName("validUByteValues")
public inline fun <reified T> Flags<UByte, T>.validValues(): Set<T>
    where T: Flag<UByte>, T : Enum<T> =
    all.filter { it.value != 0.toUByte() }.toSet()

/**
 * Obtain all discrete valid values for the [Byte] bitfield.
 * @return [Byte] set with all the valid bitfield values.
 */
@JvmName("validByteValues")
@JsName("validByteValues")
public inline fun <reified T> Flags<Byte, T>.validValues(): Set<T>
        where T: Flag<Byte>, T : Enum<T> =
    all.filter { it.value != 0.toByte() }.toSet()

/**
 * Obtain all discrete valid values for the [Short] bitfield.
 * @return [Short] set with all the valid bitfield values.
 */
@JvmName("validShortValues")
@JsName("validShortValues")
public inline fun <reified T> Flags<Short, T>.validValues(): Set<T>
        where T: Flag<Short>, T : Enum<T> =
    all.filter { it.value != 0.toShort() }.toSet()

/**
 * Obtain all discrete valid values for the [UShort] bitfield.
 * @return [UShort] set with all the valid bitfield values.
 */
@JvmName("validUShortValues")
@JsName("validUShortValues")
public inline fun <reified T> Flags<UShort, T>.validValues(): Set<T>
        where T: Flag<UShort>, T : Enum<T> =
    all.filter { it.value != 0.toUShort() }.toSet()

/**
 * Obtain all discrete valid values for the [Int] bitfield.
 * @return [Int] set with all the valid bitfield values.
 */
@JvmName("validIntValues")
@JsName("validIntValues")
public inline fun <reified T> Flags<Int, T>.validValues(): Set<T>
        where T: Flag<Int>, T : Enum<T> =
    all.filter { it.value != 0 }.toSet()

/**
 * Obtain all discrete valid values for the [UInt] bitfield.
 * @return [UInt] set with all the valid bitfield values.
 */
@JvmName("validUIntValues")
@JsName("validUIntValues")
public inline fun <reified T> Flags<UInt, T>.validValues(): Set<T>
        where T: Flag<UInt>, T : Enum<T> =
    all.filter { it.value != 0u }.toSet()

/**
 * Obtain all discrete valid values for the [Long] bitfield.
 * @return [Long] set with all the valid bitfield values.
 */
@JvmName("validLongValues")
@JsName("validLongValues")
public inline fun <reified T> Flags<Long, T>.validValues(): Set<T>
        where T: Flag<Long>, T : Enum<T> =
    all.filter { it.value != 0L }.toSet()

/**
 * Obtain all discrete valid values for the [ULong] bitfield.
 * @return [ULong] set with all the valid bitfield values.
 */
@JvmName("validULongValues")
@JsName("validULongValues")
public inline fun <reified T> Flags<ULong, T>.validValues(): Set<T>
        where T: Flag<ULong>, T : Enum<T> =
    all.filter { it.value != 0uL }.toSet()
