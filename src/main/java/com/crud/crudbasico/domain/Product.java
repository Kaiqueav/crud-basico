package com.crud.crudbasico.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="product")
@Entity(name="product")
@EqualsAndHashCode(of="id")
public class Product {
    @Id @GeneratedValue(strategy=GenerationType.UUID)
    private String id;
    private String name;
    private Number price_in_cents;

    public Product(RequestProduct requestProduct){
        this.name = requestProduct.name();
        this.price_in_cents = requestProduct.price_in_cents();
    }
    public Product  (String name, Integer price){
        
    }
}
