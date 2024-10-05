package com.maxiflexy.microservices.inventory.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "t_inventory")
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;
}

/*
V2__add_inventory.sql

insert into t_inventory (quantity, sku_code)
values (100, 'Iphone 15'),
       (100, 'pixel_8'),
       (100, 'Galaxy_24'),
       (100, 'Samsung_A02s'),

 */