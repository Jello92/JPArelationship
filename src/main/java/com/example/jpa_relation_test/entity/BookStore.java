package com.example.jpa_relation_test.entity;


import javax.persistence.*;
import java.util.List;


@Entity
public class BookStore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "BOOKSTORE_ID")
    private Long id;

    @Column
    private String location;

    @Column
    private String name;

    @OneToMany (mappedBy = "bookStore")
    private List<Book> books;

    @OneToMany
    @JoinColumn(name = "BOOKSTORE_ID")
    private List<Member> members;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books){
        this.books = books;
    }
}
