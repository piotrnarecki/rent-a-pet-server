package com.piotrnarecki.rentapet.pet;


import lombok.AllArgsConstructor;

public class PetWithDescription extends Pet{

    private String description;

    public PetWithDescription(long id, String name, String type, String breed, Double pricePerDay, String imageName, String description) {
        super(id, name, type, breed, pricePerDay, imageName);
        this.description = description;
    }
}
