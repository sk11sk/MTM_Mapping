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
@Table(name = "jpa_category")
public class Category {  // child entity just for understanding purpose

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cid;

    private String title;

    @ManyToMany
    private List<Product> products = new ArrayList<>();

    // Constructors, getters, and setters

    // Other methods if needed

    //(cascade = CascadeType.ALL)
}



