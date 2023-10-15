package behaviour.iterator.aggregator;

import behaviour.iterator.iterator.Iterator;

public interface Aggregator<T> {
    public Iterator createIterator();
}
