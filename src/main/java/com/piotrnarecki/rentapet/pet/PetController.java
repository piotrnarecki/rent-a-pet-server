package com.piotrnarecki.rentapet.pet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/pets")

public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }


    //https://dev.to/developersmill/angular-proxy-configuration-for-api-calls-130b

    @GetMapping()
    public List<Pet> getPets() {
        return petService.getPets();
    }


}
