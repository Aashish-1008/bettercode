package iterator.iterator;

import java.util.List;

public class SequentialIterator<T> implements Iterator{
    private int cursor = 0;
    private List<T> elements;

    public SequentialIterator(List<T> elements) {
        this.elements = elements;
    }

    @Override
    public boolean hasNext() {
        return cursor < elements.size();
    }

    @Override
    public T next() {
        if(hasNext())
            return (T) elements.get(cursor++);
        return null;
    }
}
