package com.ferreira.hexagonal.application.core.usecase;

import com.ferreira.hexagonal.application.core.domain.Customer;
import com.ferreira.hexagonal.application.ports.in.FindCutomerByIdInputPort;
import com.ferreira.hexagonal.application.ports.out.FindCustomerByIdOutputPort;

public class FindCustomerByIdUseCase implements FindCutomerByIdInputPort {

    private final FindCustomerByIdOutputPort findCustomerByIdOutputPort;

    public FindCustomerByIdUseCase(FindCustomerByIdOutputPort findCustomerByIdOutputPort) {
        this.findCustomerByIdOutputPort = findCustomerByIdOutputPort;
    }

    @Override
    public Customer find(String id){
        return findCustomerByIdOutputPort.find(id)
            .orElseThrow(() -> new RuntimeException("Customer not found"));
    }
}
