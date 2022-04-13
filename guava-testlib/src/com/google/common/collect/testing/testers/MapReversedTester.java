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

import com.google.common.collect.testing.AbstractMapTester;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SequencedCollection;
import java.util.SequencedSet;
import java.util.Set;
import org.junit.Ignore;

@Ignore // Affects only Android test runner, which respects JUnit 4 annotations on JUnit 3 tests.
public class MapReversedTester<K, V> extends AbstractMapTester<K, V> {
  public void testReverseKeys() {
    Set<K> keySet = getMap().keySet();
    if (!(keySet instanceof SequencedCollection)) {
      return;
    }
    SequencedSet<K> sequencedKeySet = (SequencedSet<K>) keySet;
    List<K> keyList = new ArrayList<>(keySet);
    assertEquals(keyList.reversed(), new ArrayList<>(sequencedKeySet.reversed()));
  }

  public void testReverseValues() {
    Collection<V> values = getMap().values();
    if (!(values instanceof SequencedCollection)) {
      return;
    }
    SequencedCollection<V> sequencedValues = (SequencedCollection<V>) values;
    List<V> valuesList = new ArrayList<>(values);
    assertEquals(valuesList.reversed(), new ArrayList<>(sequencedValues.reversed()));
  }

  public void testReverseEntries() {
    Set<Map.Entry<K, V>> entrySet = getMap().entrySet();
    if (!(entrySet instanceof SequencedCollection)) {
      return;
    }
    SequencedSet<Map.Entry<K, V>> sequencedEntrySet = (SequencedSet<Entry<K, V>>) entrySet;
    List<Map.Entry<K, V>> entryList = new ArrayList<>(entrySet);
    assertEquals(entryList.reversed(), new ArrayList<>(sequencedEntrySet.reversed()));
  }
}
