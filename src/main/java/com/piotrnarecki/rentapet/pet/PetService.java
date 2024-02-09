package com.piotrnarecki.rentapet.pet;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    public List<Pet> getPets() {

        return generatePetsList();

    }


    private List<Pet> generatePetsList() {


        Pet p1 = new Pet(1l, "Surfer", "dog", "Golden Retriver", 100.0);
        Pet p2 = new Pet(2l, "Schroedinger", "cat", "American Shorthair", 90.0);
        Pet p3 = new Pet(3l, "Zbigniew", "other", "Pangular", 42.0);

        List<Pet> petsList = new ArrayList<>();

        petsList.add(p1);
        petsList.add(p2);
        petsList.add(p3);

        return petsList;

    }

}
