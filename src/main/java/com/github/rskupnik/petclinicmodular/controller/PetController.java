package com.github.rskupnik.petclinicmodular.controller;

import com.github.rskupnik.petclinicmodular.application.pet.service.api.PetService;
import com.github.rskupnik.petclinicmodular.dto.PetDto;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;

@Controller("/pets")
public class PetController {

    private final PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public List<PetDto> getAll() {
        return petService.getAll().stream().map(PetDto::fromDomain).collect(Collectors.toList());
    }
}
