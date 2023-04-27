package com.example.jpa_relation_test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "BOOK_ID")
    private Long id;

    @Column
    private String author;

    @Column
    private String name;

    @Column
    private int price;

    @Column
    private long quantity;

    @ManyToOne
    @JoinColumn(name = "BOOKSTORE_ID")
    private BookStore bookStore;

    @OneToMany(mappedBy = "book")
    private List<Purchase> purchases;

    public BookStore getBookStore(){
        return bookStore;
    }

    public void setBookStore(BookStore bookStore) {
        this.bookStore = bookStore;
        bookStore.getBooks().add(this);
    }
}
