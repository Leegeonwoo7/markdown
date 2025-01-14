package com.bridge.markdown_test.repository;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Requirement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Lob
    @Column(name = "file")
    private byte[] file;

    public Requirement(String title, byte[] file) {
        this.title = title;
        this.file = file;
    }
}
//Hibernate: /* insert for com.bridge.markdown_test.repository.Requirement */insert into requirement (file,title) values (?,?)