package com.ferreira.hexagonal.adapters.out.client.mapper;


import com.ferreira.hexagonal.adapters.out.client.response.AddressResponse;
import com.ferreira.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}