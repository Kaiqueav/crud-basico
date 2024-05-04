package com.crud.crudbasico.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class Products {
    public ResponseEntity getAllProducts(){
        return ResponseEntity.ok("deuok");
    }
}
