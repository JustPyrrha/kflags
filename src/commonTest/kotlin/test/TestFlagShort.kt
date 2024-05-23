/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package test

import gay.pyrrha.kflags.Flag
import gay.pyrrha.kflags.Flags

enum class TestFlagShort(override val value: Short) : Flag<Short> {
    A(0x00),
    B(0x01),
    C(0x02),
    D(0x04),
    E(0x08),
    F(0x10);

    companion object : Flags<Short, TestFlagShort> {
        override val all: Set<TestFlagShort>
            get() = TestFlagShort.entries.toSet()
    }
}
