package com.ferreira.hexagonal.adapters.out;

import com.ferreira.hexagonal.adapters.out.repository.CustomerRepository;
import com.ferreira.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.ferreira.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.ferreira.hexagonal.application.core.domain.Customer;
import com.ferreira.hexagonal.application.ports.out.FindCustomerByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class FindCustomerByIdAdapter implements FindCustomerByIdOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public Optional<Customer> find(String id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        return customerEntity.map(entity -> customerEntityMapper.toCustomer(entity));
    }
}
