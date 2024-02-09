package com.piotrnarecki.rentapet.pet;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Pet {

    private long id;
    private String name;
    private String type;
    private String breed;
    private Double pricePerDay;


}
