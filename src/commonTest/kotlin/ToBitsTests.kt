/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import gay.pyrrha.kflags.of
import gay.pyrrha.kflags.toBits
import test.*
import kotlin.test.Test
import kotlin.test.assertEquals

class ToBitsTests {
    @Test
    fun shouldTreatNullAsNone() {
        assertEquals(0, (null as Set<TestFlagByte>?).toBits())
        assertEquals(0u, (null as Set<TestFlagUByte>?).toBits())
        assertEquals(0, (null as Set<TestFlagShort>?).toBits())
        assertEquals(0u, (null as Set<TestFlagUShort>?).toBits())
        assertEquals(0, (null as Set<TestFlagInt>?).toBits())
        assertEquals(0u, (null as Set<TestFlagUInt>?).toBits())
        assertEquals(0, (null as Set<TestFlagLong>?).toBits())
        assertEquals(0u, (null as Set<TestFlagULong>?).toBits())
    }

    @Test
    fun shouldContainAllSetBits() {
        assertEquals(0x14, TestFlagByte.of(TestFlagByte.C, TestFlagByte.E).toBits())
        assertEquals(0x14u, TestFlagUByte.of(TestFlagUByte.C, TestFlagUByte.E).toBits())
        assertEquals(0x14, TestFlagShort.of(TestFlagShort.C, TestFlagShort.E).toBits())
        assertEquals(0x14u, TestFlagUShort.of(TestFlagUShort.C, TestFlagUShort.E).toBits())
        assertEquals(0x14, TestFlagInt.of(TestFlagInt.C, TestFlagInt.E).toBits())
        assertEquals(0x14u, TestFlagUInt.of(TestFlagUInt.C, TestFlagUInt.E).toBits())
        assertEquals(0x14, TestFlagLong.of(TestFlagLong.C, TestFlagLong.E).toBits())
        assertEquals(0x14u, TestFlagULong.of(TestFlagULong.C, TestFlagULong.E).toBits())
    }
}
