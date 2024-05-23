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
        assertEquals(0x14, TestFlagByte.of(TestFlagByte.D, TestFlagByte.F).toBits())
        assertEquals(0x14u, TestFlagUByte.of(TestFlagUByte.D, TestFlagUByte.F).toBits())
        assertEquals(0x14, TestFlagShort.of(TestFlagShort.D, TestFlagShort.F).toBits())
        assertEquals(0x14u, TestFlagUShort.of(TestFlagUShort.D, TestFlagUShort.F).toBits())
        assertEquals(0x14, TestFlagInt.of(TestFlagInt.D, TestFlagInt.F).toBits())
        assertEquals(0x14u, TestFlagUInt.of(TestFlagUInt.D, TestFlagUInt.F).toBits())
        assertEquals(0x14, TestFlagLong.of(TestFlagLong.D, TestFlagLong.F).toBits())
        assertEquals(0x14u, TestFlagULong.of(TestFlagULong.D, TestFlagULong.F).toBits())
    }
}
