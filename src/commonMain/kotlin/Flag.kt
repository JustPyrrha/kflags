/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package gay.pyrrha.kflags

/**
 * Interface for a single flag which can be part of a bitfield.
 */
public interface Flag<T : Comparable<T>> {
    /**
     * Binary value of the flag.
     */
    public val value: T
}
