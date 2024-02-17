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

    @ManyToMany // you can add  @jointable() here 
    private List<Product> products = new ArrayList<>();

    // Constructors, getters, and setters

    // Other methods if needed

    //(cascade = CascadeType.ALL)
}


// its upto you whom to make child whom to make parent

//@JoinTable(name = "category_product",
//           joinColumns = @JoinColumn(name = "category_id"),inverseJoinColumns = @JoinColumn(name = "product_id"))
//

////@JoinTable(name = "category_product" : name of the third table  that  shows the relation between  parent and child entity
// @JoinTable : child entity  which does not has (mapped by=  " ")
// joinColumns  =  joins columns of parent and child entity
// @JoinColumn : child entity  primary id
// inverseJoinColumns : parent  entity  primary id

