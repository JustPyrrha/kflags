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

enum class TestFlagUInt(override val value: UInt) : Flag<UInt> {
    A(0x00u),
    B(0x01u),
    C(0x02u),
    D(0x04u),
    E(0x08u),
    F(0x10u);

    companion object : Flags<UInt, TestFlagUInt> {
        override val all: Set<TestFlagUInt>
            get() = TestFlagUInt.entries.toSet()
    }
}
