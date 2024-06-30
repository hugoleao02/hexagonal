package com.ferreira.hexagonal.application.ports.out;

import com.ferreira.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
