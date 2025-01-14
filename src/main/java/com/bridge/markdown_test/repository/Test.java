package com.bridge.markdown_test.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Test(String name) {
        this.name = name;
    }

    public Test() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
