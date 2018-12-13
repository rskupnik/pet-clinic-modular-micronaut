package com.github.rskupnik.petclinicmodular.factory;

import com.github.rskupnik.petclinicmodular.application.customer.repository.api.CustomerRepository;
import com.github.rskupnik.petclinicmodular.application.customer.service.api.CustomerService;
import com.github.rskupnik.petclinicmodular.application.pet.service.api.PetService;
import io.micronaut.context.annotation.Bean;
import io.micronaut.context.annotation.Factory;

import javax.inject.Singleton;

@Factory
public class CustomerBeanFactory {

    @Bean
    @Singleton
    public CustomerRepository customerRepository() {
        return CustomerRepository.defaultRepository();
    }

    @Bean
    @Singleton
    public CustomerService customerService(CustomerRepository repo, PetService petService) {
        return CustomerService.defaultService(repo, petService);
    }
}
