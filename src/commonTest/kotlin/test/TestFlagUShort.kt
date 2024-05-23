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

enum class TestFlagUShort(override val value: UShort) : Flag<UShort> {
    Unknown(0x00u),
    A(0x01u),
    B(0x02u),
    C(0x04u),
    D(0x08u),
    E(0x10u);

    companion object : Flags<UShort, TestFlagUShort> {
        override val all: Set<TestFlagUShort>
            get() = TestFlagUShort.entries.toFlagSet()
    }
}
