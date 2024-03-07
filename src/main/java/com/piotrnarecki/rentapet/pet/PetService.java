package com.piotrnarecki.rentapet.pet;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PetService {

    public List<Pet> getPets() {

        return generatePetsList();

    }

//    public List<PetWithDescription> getPets() {
//
//        return generatePetsWithDescriptionList();
//
//    }


    private List<Pet> generatePetsList() {


        Pet p1 = new Pet(1l, "Surfer", "dog", "Golden Retriver", 100.0, "golden_retriver.jpeg");
        Pet p2 = new Pet(2l, "Major", "dog", "Schnauzer", 80.0, "schnauzer.jpeg");
        Pet p3 = new Pet(3l, "Beag", "dog", "Beagle", 90.0, "beagle.jpeg");
        Pet p4 = new Pet(4l, "Smartie", "dog", "Border Collie", 180.0, "border_collie.jpeg");

// TO DO: add images url

        Pet p5 = new Pet(5l, "Schroedinger", "cat", "American Shorthair", 90.0, "american_shorthair_cat.jpeg");
        Pet p6 = new Pet(6l, "Garfield", "cat", "Orange Tabby", 110.0, "orange_tabby_cat.jpeg");
        Pet p7 = new Pet(7l, "Laura", "cat", "Scottish Fold", 100.0, "scottish_fold_cat.jpeg");
        Pet p8 = new Pet(8l, "Gandalf", "cat", "European Shorthair", 100.0, "european_cat.jpeg");


        Pet p9 = new Pet(9l, "Zbigniew", "exotic", "Pangular", 42.0, "pangular.jpeg");
        Pet p10 = new Pet(10l, "Linus", "exotic", "Linux", 42.0, "penguin.jpeg");
        Pet p11 = new Pet(11l, "Rider", "exotic", "dBeaver", 42.0, "beaver.jpeg");
        Pet p12 = new Pet(12l, "Guido", "exotic", "Python", 42.0, "python.jpeg");


        Pet p13 = new Pet(13l, "Wiener", "dog", "Dachshund", 88.0, "dachshund.jpeg");
        Pet p14 = new Pet(14l, "Winston", "dog", "English Bulldog", 100.0, "english_bulldog.jpeg");
        Pet p15 = new Pet(15l, "Cleopatra", "cat", "Spinx", 200.0, "sphinx_cat.jpeg");
        Pet p16 = new Pet(16l, "Prince", "cat", "Persian Cat", 95.0, "persian_cat.jpeg");
        Pet p17 = new Pet(17l, "Leonardo", "exotic", "Teenage Mutant Turtle", 70.0, "turtle.jpeg");
        Pet p18 = new Pet(18l, "Otto", "exotic", "Lizard", 150.0, "lizard.jpeg");


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
        petsList.add(p13);
        petsList.add(p14);
        petsList.add(p15);
        petsList.add(p16);
        petsList.add(p17);
        petsList.add(p18);

        return petsList;

    }


    private List<PetWithDescription> generatePetsWithDescriptionList() {


        PetWithDescription p1 = new PetWithDescription(1l, "Surfer", "dog", "Golden Retriver", 100.0, "golden_retriver.jpeg","DESCRIPTION");
        PetWithDescription p2 = new PetWithDescription(2l, "Major", "dog", "Schnauzer", 80.0, "schnauzer.jpeg","DESCRIPTION");
        PetWithDescription p3 = new PetWithDescription(3l, "Beag", "dog", "Beagle", 90.0, "beagle.jpeg","DESCRIPTION");
        PetWithDescription p4 = new PetWithDescription(4l, "Smartie", "dog", "Border Collie", 180.0, "border_collie.jpeg","DESCRIPTION");

// TO DO: add images url

        PetWithDescription p5 = new PetWithDescription(5l, "Schroedinger", "cat", "American Shorthair", 90.0, "american_shorthair_cat.jpeg","DESCRIPTION");
        PetWithDescription p6 = new PetWithDescription(6l, "Garfield", "cat", "Orange Tabby", 110.0, "orange_tabby_cat.jpeg","DESCRIPTION");
        PetWithDescription p7 = new PetWithDescription(7l, "Laura", "cat", "Scottish Fold", 100.0, "scottish_fold_cat.jpeg","DESCRIPTION");
        PetWithDescription p8 = new PetWithDescription(8l, "Gandalf", "cat", "European Shorthair", 100.0, "european_cat.jpeg","DESCRIPTION");


        PetWithDescription p9 = new PetWithDescription(9l, "Zbigniew", "exotic", "Pangular", 42.0, "pangular.jpeg","DESCRIPTION");
        PetWithDescription p10 = new PetWithDescription(10l, "Linus", "exotic", "Linux", 42.0, "penguin.jpeg","DESCRIPTION");
        PetWithDescription p11 = new PetWithDescription(11l, "Rider", "exotic", "dBeaver", 42.0, "beaver.jpeg","DESCRIPTION");
        PetWithDescription p12 = new PetWithDescription(12l, "Guido", "exotic", "Python", 42.0, "python.jpeg","DESCRIPTION");


        PetWithDescription p13 = new PetWithDescription(13l, "Wiener", "dog", "Dachshund", 88.0, "dachshund.jpeg","DESCRIPTION");
        PetWithDescription p14 = new PetWithDescription(14l, "Winston", "dog", "English Bulldog", 100.0, "english_bulldog.jpeg","DESCRIPTION");
        PetWithDescription p15 = new PetWithDescription(15l, "Cleopatra", "cat", "Spinx", 200.0, "sphinx_cat.jpeg","DESCRIPTION");
        PetWithDescription p16 = new PetWithDescription(16l, "Prince", "cat", "Persian Cat", 95.0, "persian_cat.jpeg","DESCRIPTION");
        PetWithDescription p17 = new PetWithDescription(17l, "Leonardo", "exotic", "Teenage Mutant Turtle", 70.0, "turtle.jpeg","DESCRIPTION");
        PetWithDescription p18 = new PetWithDescription(18l, "Otto", "exotic", "Lizard", 150.0, "lizard.jpeg","DESCRIPTION");


        List<PetWithDescription> petsList = new ArrayList<>();

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
        petsList.add(p13);
        petsList.add(p14);
        petsList.add(p15);
        petsList.add(p16);
        petsList.add(p17);
        petsList.add(p18);

        return petsList;

    }

}
