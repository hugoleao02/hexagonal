package com.ferreira.hexagonal.application.core.usecase;

import com.ferreira.hexagonal.application.core.domain.Address;
import com.ferreira.hexagonal.application.core.domain.Customer;
import com.ferreira.hexagonal.application.ports.in.FindCutomerByIdInputPort;
import com.ferreira.hexagonal.application.ports.in.UpdateCustomerInputPort;
import com.ferreira.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import com.ferreira.hexagonal.application.ports.out.UpdateCustomerOutputPort;

public class UpdateCustumerUseCase implements UpdateCustomerInputPort {

    private final FindCutomerByIdInputPort findCutomerByIdInputPort;

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;

    private final UpdateCustomerOutputPort updateCustomerOutputPort;
    public UpdateCustumerUseCase(FindCutomerByIdInputPort findCutomerByIdInputPort,
                                 FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort, UpdateCustomerOutputPort updateCustomerOutputPort) {
        this.findCutomerByIdInputPort = findCutomerByIdInputPort;
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.updateCustomerOutputPort = updateCustomerOutputPort;
    }

    @Override
    public void update(Customer customer, String zipCode){
        findCutomerByIdInputPort.find(customer.getId());
        Address address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        updateCustomerOutputPort.update(customer);
    }
}
