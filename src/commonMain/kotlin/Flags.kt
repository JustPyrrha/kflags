/*
 * Copyright (C) 2024 Pyrrha Wills - All Rights Reserved
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package gay.pyrrha.kflags

/**
 * Interface for a helper object for a type of flag.
 */
public interface Flags<T: Comparable<T>, U> where U: Flag<T>, U: Enum<U> {
    /**
     * Predefined set with all possible flag values.
     */
    public val all: Set<U>
}
