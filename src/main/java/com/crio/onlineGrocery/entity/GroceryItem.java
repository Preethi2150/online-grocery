package com.crio.onlineGrocery.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GroceryItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private Double price;

    private Integer quantity;

    @ManyToMany(mappedBy = "items")
    private List<GroceryOrder> orders;
}