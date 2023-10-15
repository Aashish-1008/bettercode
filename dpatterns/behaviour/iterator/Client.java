package behaviour.iterator;

import behaviour.iterator.aggregator.LibraryAggregator;
import behaviour.iterator.iterator.Iterator;
import behaviour.iterator.model.Book;
import behaviour.iterator.model.Item;

import java.util.Arrays;
import java.util.List;

public class Client{

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(new Book[]{
                new Book(1, "abc"),
                new Book(2, "def"),
                new Book(3, "ghi"),
                new Book(4, "jkl")
        });

        LibraryAggregator<Book> bookLibrary = new LibraryAggregator<>(books);
        Iterator<Book> iterator = bookLibrary.createIterator();
        while (iterator.hasNext())
            System.out.println(iterator.next().getId());

        List<Item> items = Arrays.asList(new Item[]{
                new Item(1, "abc"),
                new Item(2, "def"),
                new Item(3, "ghi"),
                new Item(4, "jkl")
        });

        LibraryAggregator<Item> itemLibrary = new LibraryAggregator<>(items);

        Iterator<Item> itemIterator = itemLibrary.createIterator();

        while (itemIterator.hasNext())
            System.out.println(itemIterator.next().getItemname());
    
    }
}