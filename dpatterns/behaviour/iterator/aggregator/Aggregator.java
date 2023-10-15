package dpatterns.behaviour.iterator.aggregator;

import dpatterns.behaviour.iterator.iterator.Iterator;

public interface Aggregator<T> {
    public Iterator createIterator();
}
