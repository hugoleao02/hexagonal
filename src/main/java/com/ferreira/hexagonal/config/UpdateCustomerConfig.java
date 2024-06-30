package com.ferreira.hexagonal.config;

import com.ferreira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.ferreira.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.ferreira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.ferreira.hexagonal.application.core.usecase.UpdateCustumerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustumerUseCase updateCustumerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ){
        return  new UpdateCustumerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
