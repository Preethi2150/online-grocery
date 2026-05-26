package com.crio.onlineGrocery.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String address;

    private String phone;

    @OneToMany(mappedBy = "customer")
    private List<GroceryOrder> orders;

    public Customer() {
    }
}