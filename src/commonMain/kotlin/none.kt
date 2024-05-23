/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

@file:JvmName("NoneEnumSet")

package gay.pyrrha.kflags

import kotlin.jvm.JvmName

public inline fun <reified T> Flags<*, T>.none(): Set<T>
        where T: Flag<*>, T: Enum<T> = emptySet<T>()
