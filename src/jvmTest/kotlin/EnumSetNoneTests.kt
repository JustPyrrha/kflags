/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import gay.pyrrha.kflags.enumSetNone
import gay.pyrrha.kflags.toBits
import test.*
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse

class EnumSetNoneTests {
    @Test
    fun `should have no set bits`() {
        assertEquals(0, TestFlagByte.enumSetNone().toBits())
        assertEquals(0u, TestFlagUByte.enumSetNone().toBits())
        assertEquals(0, TestFlagShort.enumSetNone().toBits())
        assertEquals(0u, TestFlagUShort.enumSetNone().toBits())
        assertEquals(0, TestFlagInt.enumSetNone().toBits())
        assertEquals(0u, TestFlagUInt.enumSetNone().toBits())
        assertEquals(0, TestFlagLong.enumSetNone().toBits())
        assertEquals(0u, TestFlagULong.enumSetNone().toBits())
    }

    @Test
    fun `should have no entries`() {
        assertEquals(0, TestFlagByte.enumSetNone().size)
        assertEquals(0, TestFlagUByte.enumSetNone().size)
        assertEquals(0, TestFlagShort.enumSetNone().size)
        assertEquals(0, TestFlagUShort.enumSetNone().size)
        assertEquals(0, TestFlagInt.enumSetNone().size)
        assertEquals(0, TestFlagUInt.enumSetNone().size)
        assertEquals(0, TestFlagLong.enumSetNone().size)
        assertEquals(0, TestFlagULong.enumSetNone().size)
    }

    @Test
    fun `should have no flags set`() {
        assertFalse(TestFlagByte.enumSetNone().contains(TestFlagByte.A))
        assertFalse(TestFlagByte.enumSetNone().contains(TestFlagByte.B))
        assertFalse(TestFlagByte.enumSetNone().contains(TestFlagByte.C))
        assertFalse(TestFlagByte.enumSetNone().contains(TestFlagByte.D))
        assertFalse(TestFlagByte.enumSetNone().contains(TestFlagByte.E))

        assertFalse(TestFlagUByte.enumSetNone().contains(TestFlagUByte.A))
        assertFalse(TestFlagUByte.enumSetNone().contains(TestFlagUByte.B))
        assertFalse(TestFlagUByte.enumSetNone().contains(TestFlagUByte.C))
        assertFalse(TestFlagUByte.enumSetNone().contains(TestFlagUByte.D))
        assertFalse(TestFlagUByte.enumSetNone().contains(TestFlagUByte.E))

        assertFalse(TestFlagShort.enumSetNone().contains(TestFlagShort.A))
        assertFalse(TestFlagShort.enumSetNone().contains(TestFlagShort.B))
        assertFalse(TestFlagShort.enumSetNone().contains(TestFlagShort.C))
        assertFalse(TestFlagShort.enumSetNone().contains(TestFlagShort.D))
        assertFalse(TestFlagShort.enumSetNone().contains(TestFlagShort.E))

        assertFalse(TestFlagUShort.enumSetNone().contains(TestFlagUShort.A))
        assertFalse(TestFlagUShort.enumSetNone().contains(TestFlagUShort.B))
        assertFalse(TestFlagUShort.enumSetNone().contains(TestFlagUShort.C))
        assertFalse(TestFlagUShort.enumSetNone().contains(TestFlagUShort.D))
        assertFalse(TestFlagUShort.enumSetNone().contains(TestFlagUShort.E))

        assertFalse(TestFlagInt.enumSetNone().contains(TestFlagInt.A))
        assertFalse(TestFlagInt.enumSetNone().contains(TestFlagInt.B))
        assertFalse(TestFlagInt.enumSetNone().contains(TestFlagInt.C))
        assertFalse(TestFlagInt.enumSetNone().contains(TestFlagInt.D))
        assertFalse(TestFlagInt.enumSetNone().contains(TestFlagInt.E))

        assertFalse(TestFlagUInt.enumSetNone().contains(TestFlagUInt.A))
        assertFalse(TestFlagUInt.enumSetNone().contains(TestFlagUInt.B))
        assertFalse(TestFlagUInt.enumSetNone().contains(TestFlagUInt.C))
        assertFalse(TestFlagUInt.enumSetNone().contains(TestFlagUInt.D))
        assertFalse(TestFlagUInt.enumSetNone().contains(TestFlagUInt.E))

        assertFalse(TestFlagLong.enumSetNone().contains(TestFlagLong.A))
        assertFalse(TestFlagLong.enumSetNone().contains(TestFlagLong.B))
        assertFalse(TestFlagLong.enumSetNone().contains(TestFlagLong.C))
        assertFalse(TestFlagLong.enumSetNone().contains(TestFlagLong.D))
        assertFalse(TestFlagLong.enumSetNone().contains(TestFlagLong.E))

        assertFalse(TestFlagULong.enumSetNone().contains(TestFlagULong.A))
        assertFalse(TestFlagULong.enumSetNone().contains(TestFlagULong.B))
        assertFalse(TestFlagULong.enumSetNone().contains(TestFlagULong.C))
        assertFalse(TestFlagULong.enumSetNone().contains(TestFlagULong.D))
        assertFalse(TestFlagULong.enumSetNone().contains(TestFlagULong.E))
    }
}
