package com.ferreira.hexagonal.config;

import com.ferreira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.ferreira.hexagonal.adapters.out.InsertCustomerAdapter;
import com.ferreira.hexagonal.adapters.out.SendCpfValitationAdapter;
import com.ferreira.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValitationAdapter sendCpfValitationAdapter
    ){
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter,insertCustomerAdapter, sendCpfValitationAdapter);
    }
}
