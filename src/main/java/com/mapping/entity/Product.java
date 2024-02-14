package com.mapping.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "jpa_product")
public class Product { // parent entity just for understanding purpose

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String pid;

    private String productName;


    @ManyToMany(mappedBy = "products" )
    private List<Category> categories = new ArrayList<>();

//    @ManyToMany
//    private List<Category> categories = new ArrayList<>();

    // Constructors, getters, and setters

    // Other methods if needed
}

