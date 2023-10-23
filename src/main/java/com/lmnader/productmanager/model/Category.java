package com.lmnader.productmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "categories")

public class Category {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "name" )
    private String name;

    @Column(name = "description")
    private String description;
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
    private Collection<Product> products;

    public Category(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
