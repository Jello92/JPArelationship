package com.example.jpa_relation_test.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String address;

    @Column
    private String email;

    @Column
    private String nickname;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @ManyToOne
    @JoinColumn(name = "BOOKSTORE_ID")
    private BookStore bookStore;

    @OneToMany(mappedBy = "member")
    private List<Purchase> purchases;
}
