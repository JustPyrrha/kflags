/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package gay.pyrrha.kflags

import java.util.EnumSet

/**
 * Conversion from collection of flags to a bitfield
 * @return bitfield
 */
public inline fun <reified T : Enum<T>> Array<out T>.toEnumSet(): EnumSet<T> =
    EnumSet.noneOf(T::class.java).apply {
        addAll(this@toEnumSet)
    }

/**
 * Conversion from collection of flags to a bitfield
 * @return bitfield
 */
public inline fun <reified T : Enum<T>> Collection<T>.toEnumSet(): EnumSet<T> =
    EnumSet.noneOf(T::class.java).apply {
        addAll(this@toEnumSet)
    }
