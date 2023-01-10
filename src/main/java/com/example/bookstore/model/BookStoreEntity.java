package com.example.bookstore.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bookstore")
@Setter
@Getter
@NoArgsConstructor
public class BookStoreEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "price")
    private String price;
    @Column(name = "short_desc")
    private String shortDesc;
    @Column(name = "author")
    private String author;
}
