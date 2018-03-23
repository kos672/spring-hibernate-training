package com.kuzmin.train.training.business.address;

import org.springframework.stereotype.Component;

@Component("cityService")
public class CityAddressServiceImpl implements AddressService {
    @Override
    public String cityType() {
        return "city";
    }
}
