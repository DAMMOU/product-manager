package com.lmnader.productmanager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double price;  // Changé "prix" en "price" pour refléter la langue anglaise
    private String description;  // Changé "desc" en "description" pour plus de clarté
    private Date creationDate;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Product(String name, Double price, String description, Date creationDate, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.creationDate = creationDate;
        this.category = category;
    }


}
