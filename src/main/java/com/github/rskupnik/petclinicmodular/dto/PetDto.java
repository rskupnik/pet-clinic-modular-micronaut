package com.github.rskupnik.petclinicmodular.dto;

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
}
