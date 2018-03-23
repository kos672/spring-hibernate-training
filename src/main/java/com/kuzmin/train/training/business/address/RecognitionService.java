package com.kuzmin.train.training.business.address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RecognitionService {

    private AddressService addressService;

    @Autowired
    public RecognitionService(@Qualifier("villageService") AddressService addressService) {
        this.addressService = addressService;
    }

    public String recognizeType() {
        return addressService.cityType();
    }
}
