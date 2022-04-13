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
package com.google.common.collect;

import java.util.SequencedCollection;

public abstract class ForwardingSequencedCollection<E> extends ForwardingCollection<E> implements
    SequencedCollection<E> {

  protected ForwardingSequencedCollection() {
  }

  @Override
  protected abstract SequencedCollection<E> delegate();

  @Override
  public SequencedCollection<E> reversed() {
    return delegate().reversed();
  }

  @Override
  public void addFirst(E e) {
    delegate().addFirst(e);
  }

  @Override
  public void addLast(E e) {
    delegate().addLast(e);
  }

  @Override
  public E getFirst() {
    return delegate().getFirst();
  }

  @Override
  public E getLast() {
    return delegate().getLast();
  }

  @Override
  public E removeFirst() {
    return delegate().removeFirst();
  }

  @Override
  public E removeLast() {
    return delegate().removeLast();
  }
}
