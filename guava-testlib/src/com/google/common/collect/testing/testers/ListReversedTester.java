package com.google.common.collect.testing.testers;

import java.util.ArrayList;
import java.util.List;
import org.junit.Ignore;

@Ignore // Affects only Android test runner, which respects JUnit 4 annotations on JUnit 3 tests.
public class ListReversedTester<E> extends AbstractListTester<E> {
  public void testReversed() {
    List<E> list = getList();
    assertEquals(new ArrayList<>(list).reversed(), list.reversed());
  }
}
