package com.ferreira.hexagonal.application.ports.in;

import com.ferreira.hexagonal.application.core.domain.Customer;

public interface FindCutomerByIdInputPort {

    Customer find(String id);
}
