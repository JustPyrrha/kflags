/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import gay.pyrrha.kflags.toFlagSet
import test.TestFlagByte
import test.TestFlagShort
import test.TestFlagUByte
import test.TestFlagUShort
import kotlin.test.Test
import kotlin.test.assertEquals

class ToSetTests {
    @Test
    fun shouldContainTheSameValues() {
        val byteValues = listOf(TestFlagByte.A, TestFlagByte.E)
        assertEquals(byteValues.toSet(), byteValues.toFlagSet())

        val uByteValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(uByteValues.toSet(), uByteValues.toFlagSet())

        val shortValues = listOf(TestFlagShort.A, TestFlagShort.E)
        assertEquals(shortValues.toSet(), shortValues.toFlagSet())

        val uShortValues = listOf(TestFlagUShort.A, TestFlagUShort.E)
        assertEquals(uShortValues.toSet(), uShortValues.toFlagSet())

        val intValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(intValues.toSet(), intValues.toFlagSet())

        val uIntValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(uIntValues.toSet(), uIntValues.toFlagSet())

        val longValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(longValues.toSet(), longValues.toFlagSet())

        val uLongValues = listOf(TestFlagUByte.A, TestFlagUByte.E)
        assertEquals(uLongValues.toSet(), uLongValues.toFlagSet())
    }
}
