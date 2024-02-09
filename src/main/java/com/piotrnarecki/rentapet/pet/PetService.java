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
        Pet p2 = new Pet(2l, "Major", "dog", "Schnauzer", 80.0);
        Pet p3 = new Pet(3l, "Beag", "dog", "Beagle", 90.0);
        Pet p4 = new Pet(4l, "Scoobie Doo", "dog", "Canarian Dog", 180.0);


        Pet p5 = new Pet(5l, "Schroedinger", "cat", "American Shorthair", 90.0);
        Pet p6 = new Pet(6l, "Garfield", "cat", "Orange Tabby", 110.0);
        Pet p7 = new Pet(7l, "Laura", "cat", "Scottish Fold", 100.0);
        Pet p8 = new Pet(8l, "Gandalf", "cat", "American Shorthair", 100.0);


        Pet p9 = new Pet(9l, "Zbigniew", "other", "Pangular", 42.0);
        Pet p10 = new Pet(10l, "Linus", "other", "Linux", 42.0);
        Pet p11 = new Pet(11l, "Rider", "other", "dBeaver", 42.0);
        Pet p12 = new Pet(12l, "Guido", "other", "Python", 42.0);



        List<Pet> petsList = new ArrayList<>();

        petsList.add(p1);
        petsList.add(p2);
        petsList.add(p3);
        petsList.add(p4);
        petsList.add(p5);
        petsList.add(p6);
        petsList.add(p7);
        petsList.add(p8);
        petsList.add(p9);
        petsList.add(p10);
        petsList.add(p11);
        petsList.add(p12);

        return petsList;

    }

}
