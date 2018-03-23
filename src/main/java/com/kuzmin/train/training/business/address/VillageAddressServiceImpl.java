package com.kuzmin.train.training.business.address;

import org.springframework.stereotype.Component;

@Component("villageService")
public class VillageAddressServiceImpl implements AddressService {
    @Override
    public String cityType() {
        return "village";
    }
}
