package dpatterns.behaviour.iterator.aggregator;

import dpatterns.behaviour.iterator.iterator.Iterator;
import dpatterns.behaviour.iterator.iterator.SequentialIterator;
import dpatterns.behaviour.iterator.model.Book;

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
