package com.github.eutkin.test.entity;

import javax.persistence.*;

@Entity
@Table(name = "authors")
public class Author {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "name")
    private String name;
}
