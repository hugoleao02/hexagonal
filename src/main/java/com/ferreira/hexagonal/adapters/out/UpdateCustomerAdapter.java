package com.ferreira.hexagonal.adapters.out;

import com.ferreira.hexagonal.adapters.in.controller.mapper.CustomerMapper;
import com.ferreira.hexagonal.adapters.out.repository.CustomerRepository;
import com.ferreira.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.ferreira.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ferreira.hexagonal.application.core.domain.Customer;
import com.ferreira.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        CustomerEntity custumerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(custumerEntity);
    }
}
