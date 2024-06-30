package com.ferreira.hexagonal.config;

import com.ferreira.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.ferreira.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.ferreira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {

    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ){
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase,deleteCustomerByIdAdapter);
    }
}

