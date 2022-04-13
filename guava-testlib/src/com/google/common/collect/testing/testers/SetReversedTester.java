/*
 * Copyright (C) 2022 The Guava Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.common.collect.testing.testers;

import java.util.ArrayList;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import org.junit.Ignore;

@Ignore // Affects only Android test runner, which respects JUnit 4 annotations on JUnit 3 tests.
public class SetReversedTester<E> extends AbstractSetTester<E> {
  public void testReversed() {
    Set<E> set = getSet();
    if (!(set instanceof SequencedCollection)) {
      return;
    }
    SequencedSet<E> sequencedSet = (SequencedSet<E>) set;
    assertEquals(new ArrayList<>(set).reversed(), new ArrayList<>(sequencedSet.reversed()));
  }
}
