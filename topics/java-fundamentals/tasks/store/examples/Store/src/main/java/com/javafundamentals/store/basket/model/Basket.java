package com.javafundamentals.store.basket.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Basket {

    private UUID id;

    private UUID userId;

    private UUID productId;

}
