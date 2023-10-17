package iterator.aggregator;


import iterator.iterator.Iterator;
import iterator.iterator.SequentialIterator;

import java.util.List;

public class LibraryAggregator<T> implements Aggregator{

    private List<T> list;

    public LibraryAggregator(List<T> list) {
        this.list = list;
    }

    @Override
    public Iterator createIterator() {
        return new SequentialIterator(list);
    }
}
