package com.github.rskupnik.petclinicmodular.controller;

import com.github.rskupnik.petclinicmodular.application.customer.service.api.CustomerService;
import com.github.rskupnik.petclinicmodular.dto.CustomerDto;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Get(value = "/{id}", produces = MediaType.APPLICATION_JSON)
    public CustomerDto get(Long id) {
        return CustomerDto.fromDomain(customerService.get(id));
    }

    @Get(produces = MediaType.APPLICATION_JSON)
    public List<CustomerDto> getAll() {
        return customerService.getAll().stream().map(CustomerDto::fromDomain).collect(Collectors.toList());
    }

    @Post(consumes = MediaType.APPLICATION_JSON)
    public void add(@Body CustomerDto customerDto) {
        customerService.add(customerDto.toDomain());
    }
}
