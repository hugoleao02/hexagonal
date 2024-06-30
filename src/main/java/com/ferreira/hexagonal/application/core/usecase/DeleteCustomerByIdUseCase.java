package com.ferreira.hexagonal.application.core.usecase;

import com.ferreira.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.ferreira.hexagonal.application.ports.in.FindCutomerByIdInputPort;
import com.ferreira.hexagonal.application.ports.out.DeleteCustomerByIdOutputPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final FindCutomerByIdInputPort findCutomerByIdInputPort;

    private final DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort;

    public DeleteCustomerByIdUseCase(FindCutomerByIdInputPort findCutomerByIdInputPort, DeleteCustomerByIdOutputPort deleteCustomerByIdOutputPort) {
        this.findCutomerByIdInputPort = findCutomerByIdInputPort;
        this.deleteCustomerByIdOutputPort = deleteCustomerByIdOutputPort;
    }

    @Override
    public void delete(String id){
        findCutomerByIdInputPort.find(id);
        deleteCustomerByIdOutputPort.delete(id);
    }
}
