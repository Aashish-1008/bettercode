package dpatterns.behaviour.iterator.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    int id;
    String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
