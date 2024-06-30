package com.ferreira.hexagonal.adapters.out;

import com.ferreira.hexagonal.adapters.out.repository.CustomerRepository;
import com.ferreira.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.ferreira.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ferreira.hexagonal.application.core.domain.Customer;
import com.ferreira.hexagonal.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        CustomerEntity custumerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(custumerEntity);
    }
}
