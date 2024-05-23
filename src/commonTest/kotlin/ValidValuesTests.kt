/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

import gay.pyrrha.kflags.validValues
import test.*
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class ValidValuesTests {

    @Test
    fun shouldContainKnownGoodValues() {
        assertTrue(TestFlagByte.validValues().contains(TestFlagByte.A))
        assertTrue(TestFlagByte.validValues().contains(TestFlagByte.B))
        assertTrue(TestFlagByte.validValues().contains(TestFlagByte.C))
        assertTrue(TestFlagByte.validValues().contains(TestFlagByte.D))
        assertTrue(TestFlagByte.validValues().contains(TestFlagByte.E))

        assertTrue(TestFlagUByte.validValues().contains(TestFlagUByte.A))
        assertTrue(TestFlagUByte.validValues().contains(TestFlagUByte.B))
        assertTrue(TestFlagUByte.validValues().contains(TestFlagUByte.C))
        assertTrue(TestFlagUByte.validValues().contains(TestFlagUByte.D))
        assertTrue(TestFlagUByte.validValues().contains(TestFlagUByte.E))

        assertTrue(TestFlagShort.validValues().contains(TestFlagShort.A))
        assertTrue(TestFlagShort.validValues().contains(TestFlagShort.B))
        assertTrue(TestFlagShort.validValues().contains(TestFlagShort.C))
        assertTrue(TestFlagShort.validValues().contains(TestFlagShort.D))
        assertTrue(TestFlagShort.validValues().contains(TestFlagShort.E))

        assertTrue(TestFlagUShort.validValues().contains(TestFlagUShort.A))
        assertTrue(TestFlagUShort.validValues().contains(TestFlagUShort.B))
        assertTrue(TestFlagUShort.validValues().contains(TestFlagUShort.C))
        assertTrue(TestFlagUShort.validValues().contains(TestFlagUShort.D))
        assertTrue(TestFlagUShort.validValues().contains(TestFlagUShort.E))

        assertTrue(TestFlagInt.validValues().contains(TestFlagInt.A))
        assertTrue(TestFlagInt.validValues().contains(TestFlagInt.B))
        assertTrue(TestFlagInt.validValues().contains(TestFlagInt.C))
        assertTrue(TestFlagInt.validValues().contains(TestFlagInt.D))
        assertTrue(TestFlagInt.validValues().contains(TestFlagInt.E))

        assertTrue(TestFlagUInt.validValues().contains(TestFlagUInt.A))
        assertTrue(TestFlagUInt.validValues().contains(TestFlagUInt.B))
        assertTrue(TestFlagUInt.validValues().contains(TestFlagUInt.C))
        assertTrue(TestFlagUInt.validValues().contains(TestFlagUInt.D))
        assertTrue(TestFlagUInt.validValues().contains(TestFlagUInt.E))

        assertTrue(TestFlagLong.validValues().contains(TestFlagLong.A))
        assertTrue(TestFlagLong.validValues().contains(TestFlagLong.B))
        assertTrue(TestFlagLong.validValues().contains(TestFlagLong.C))
        assertTrue(TestFlagLong.validValues().contains(TestFlagLong.D))
        assertTrue(TestFlagLong.validValues().contains(TestFlagLong.E))

        assertTrue(TestFlagULong.validValues().contains(TestFlagULong.A))
        assertTrue(TestFlagULong.validValues().contains(TestFlagULong.B))
        assertTrue(TestFlagULong.validValues().contains(TestFlagULong.C))
        assertTrue(TestFlagULong.validValues().contains(TestFlagULong.D))
        assertTrue(TestFlagULong.validValues().contains(TestFlagULong.E))
    }

    @Test
    fun shouldNotContainKnownBadValues() {
        assertFalse(TestFlagByte.validValues().contains(TestFlagByte.Unknown))
        assertFalse(TestFlagUByte.validValues().contains(TestFlagUByte.Unknown))
        assertFalse(TestFlagShort.validValues().contains(TestFlagShort.Unknown))
        assertFalse(TestFlagUShort.validValues().contains(TestFlagUShort.Unknown))
        assertFalse(TestFlagInt.validValues().contains(TestFlagInt.Unknown))
        assertFalse(TestFlagUInt.validValues().contains(TestFlagUInt.Unknown))
        assertFalse(TestFlagLong.validValues().contains(TestFlagLong.Unknown))
        assertFalse(TestFlagULong.validValues().contains(TestFlagULong.Unknown))
    }
}
