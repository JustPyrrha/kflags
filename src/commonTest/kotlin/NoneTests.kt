/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import gay.pyrrha.kflags.none
import gay.pyrrha.kflags.toBits
import test.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class NoneTests {
    @Test
    fun shouldHaveNoBitsSet() {
        assertEquals(0, TestFlagByte.none().toBits())
        assertEquals(0u, TestFlagUByte.none().toBits())
        assertEquals(0, TestFlagShort.none().toBits())
        assertEquals(0u, TestFlagUShort.none().toBits())
        assertEquals(0, TestFlagInt.none().toBits())
        assertEquals(0u, TestFlagUInt.none().toBits())
        assertEquals(0, TestFlagLong.none().toBits())
        assertEquals(0u, TestFlagULong.none().toBits())
    }

    @Test
    fun shouldHaveNoEntries() {
        assertEquals(0, TestFlagByte.none().size)
        assertEquals(0, TestFlagUByte.none().size)
        assertEquals(0, TestFlagShort.none().size)
        assertEquals(0, TestFlagUShort.none().size)
        assertEquals(0, TestFlagInt.none().size)
        assertEquals(0, TestFlagUInt.none().size)
        assertEquals(0, TestFlagLong.none().size)
        assertEquals(0, TestFlagULong.none().size)
    }

    @Test
    fun shouldHaveNoFlagsSet() {
        assertFalse(TestFlagByte.none().contains(TestFlagByte.A))
        assertFalse(TestFlagByte.none().contains(TestFlagByte.B))
        assertFalse(TestFlagByte.none().contains(TestFlagByte.C))
        assertFalse(TestFlagByte.none().contains(TestFlagByte.D))
        assertFalse(TestFlagByte.none().contains(TestFlagByte.E))
        assertFalse(TestFlagByte.none().contains(TestFlagByte.F))

        assertFalse(TestFlagUByte.none().contains(TestFlagUByte.A))
        assertFalse(TestFlagUByte.none().contains(TestFlagUByte.B))
        assertFalse(TestFlagUByte.none().contains(TestFlagUByte.C))
        assertFalse(TestFlagUByte.none().contains(TestFlagUByte.D))
        assertFalse(TestFlagUByte.none().contains(TestFlagUByte.E))
        assertFalse(TestFlagUByte.none().contains(TestFlagUByte.F))

        assertFalse(TestFlagShort.none().contains(TestFlagShort.A))
        assertFalse(TestFlagShort.none().contains(TestFlagShort.B))
        assertFalse(TestFlagShort.none().contains(TestFlagShort.C))
        assertFalse(TestFlagShort.none().contains(TestFlagShort.D))
        assertFalse(TestFlagShort.none().contains(TestFlagShort.E))
        assertFalse(TestFlagShort.none().contains(TestFlagShort.F))

        assertFalse(TestFlagUShort.none().contains(TestFlagUShort.A))
        assertFalse(TestFlagUShort.none().contains(TestFlagUShort.B))
        assertFalse(TestFlagUShort.none().contains(TestFlagUShort.C))
        assertFalse(TestFlagUShort.none().contains(TestFlagUShort.D))
        assertFalse(TestFlagUShort.none().contains(TestFlagUShort.E))
        assertFalse(TestFlagUShort.none().contains(TestFlagUShort.F))

        assertFalse(TestFlagInt.none().contains(TestFlagInt.A))
        assertFalse(TestFlagInt.none().contains(TestFlagInt.B))
        assertFalse(TestFlagInt.none().contains(TestFlagInt.C))
        assertFalse(TestFlagInt.none().contains(TestFlagInt.D))
        assertFalse(TestFlagInt.none().contains(TestFlagInt.E))
        assertFalse(TestFlagInt.none().contains(TestFlagInt.F))

        assertFalse(TestFlagUInt.none().contains(TestFlagUInt.A))
        assertFalse(TestFlagUInt.none().contains(TestFlagUInt.B))
        assertFalse(TestFlagUInt.none().contains(TestFlagUInt.C))
        assertFalse(TestFlagUInt.none().contains(TestFlagUInt.D))
        assertFalse(TestFlagUInt.none().contains(TestFlagUInt.E))
        assertFalse(TestFlagUInt.none().contains(TestFlagUInt.F))

        assertFalse(TestFlagLong.none().contains(TestFlagLong.A))
        assertFalse(TestFlagLong.none().contains(TestFlagLong.B))
        assertFalse(TestFlagLong.none().contains(TestFlagLong.C))
        assertFalse(TestFlagLong.none().contains(TestFlagLong.D))
        assertFalse(TestFlagLong.none().contains(TestFlagLong.E))
        assertFalse(TestFlagLong.none().contains(TestFlagLong.F))

        assertFalse(TestFlagULong.none().contains(TestFlagULong.A))
        assertFalse(TestFlagULong.none().contains(TestFlagULong.B))
        assertFalse(TestFlagULong.none().contains(TestFlagULong.C))
        assertFalse(TestFlagULong.none().contains(TestFlagULong.D))
        assertFalse(TestFlagULong.none().contains(TestFlagULong.E))
        assertFalse(TestFlagULong.none().contains(TestFlagULong.F))
    }
}
