package com.ferreira.hexagonal.application.ports.in;

import com.ferreira.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);
}
