package com.ferreira.hexagonal.config;

import com.ferreira.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.ferreira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerConfig {

    @Bean
    public FindCustomerByIdUseCase FindCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter){
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
