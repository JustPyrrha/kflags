/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import gay.pyrrha.kflags.toEnumSet
import test.TestFlagByte
import test.TestFlagShort
import test.TestFlagUByte
import test.TestFlagUShort
import java.util.EnumSet
import kotlin.test.Test
import kotlin.test.assertEquals

class ToEnumSetTests {
    @Test
    fun `should contain the same values`() {
        val byteValues = listOf(TestFlagByte.Unknown, TestFlagByte.D)
        assertEquals(EnumSet.copyOf(byteValues), byteValues.toEnumSet())

        val uByteValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(EnumSet.copyOf(uByteValues), uByteValues.toEnumSet())

        val shortValues = listOf(TestFlagShort.A, TestFlagShort.E)
        assertEquals(EnumSet.copyOf(shortValues), shortValues.toEnumSet())

        val uShortValues = listOf(TestFlagUShort.A, TestFlagUShort.E)
        assertEquals(EnumSet.copyOf(uShortValues), uShortValues.toEnumSet())

        val intValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(EnumSet.copyOf(intValues), intValues.toEnumSet())

        val uIntValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(EnumSet.copyOf(uIntValues), uIntValues.toEnumSet())

        val longValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(EnumSet.copyOf(longValues), longValues.toEnumSet())

        val uLongValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(EnumSet.copyOf(uLongValues), uLongValues.toEnumSet())
    }
}
