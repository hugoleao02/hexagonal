package com.ferreira.hexagonal.application.ports.out;

import com.ferreira.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {

    void update(Customer customer);
}
