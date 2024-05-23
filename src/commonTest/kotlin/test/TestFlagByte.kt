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
import gay.pyrrha.kflags.toFlagSet

enum class TestFlagByte(override val value: Byte) : Flag<Byte> {
    Unknown(0x00),
    A(0x01),
    B(0x02),
    C(0x04),
    D(0x08),
    E(0x10);

    companion object : Flags<Byte, TestFlagByte> {
        override val all: Set<TestFlagByte>
            get() = entries.toFlagSet()
    }
}
