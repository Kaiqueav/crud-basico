package com.crud.crudbasico.domain;

import java.util.UUID;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestProduct(
    UUID id,
    @NotBlank
    String name, 
    @NotNull
    Integer price_in_cents){


}
