package com.github.rskupnik.petclinicmodular.controller;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/pets")
public class PetController {

    @Get(produces = MediaType.APPLICATION_JSON)
    public void getAll() {

    }
}
