package com.github.rskupnik.petclinicmodular.factory;

import com.github.rskupnik.petclinicmodular.application.pet.repository.api.PetRepository;
import com.github.rskupnik.petclinicmodular.application.pet.service.api.PetService;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

import javax.inject.Singleton;

@Factory
public class PetBeanFactory {

    @Bean
    @Singleton
    public PetRepository petRepository() {
        return PetRepository.defaultRepository();
    }

    @Bean
    @Singleton
    public PetService petService(PetRepository repo) {
        return PetService.defaultService(repo);
    }
}
