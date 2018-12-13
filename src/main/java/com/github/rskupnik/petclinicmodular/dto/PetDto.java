package com.github.rskupnik.petclinicmodular.dto;

import com.github.rskupnik.petclinicmodular.domain.pet.Pet;

public class PetDto {

    private String name;

    public PetDto() {

    }

    private PetDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static PetDto fromDomain(Pet pet) {
        return new PetDto(pet.getName());
    }

    public Pet toDomain() {
        return new Pet(name);
    }
}
