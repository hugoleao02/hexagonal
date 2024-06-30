package com.ferreira.hexagonal.application.ports.out;

import com.ferreira.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
