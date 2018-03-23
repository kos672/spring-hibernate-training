package com.kuzmin.train.training.business.address;

import com.kuzmin.train.training.business.abstracts.Converter;
import com.kuzmin.train.training.business.model.Address;
import org.springframework.stereotype.Component;

@Component
public class AddressConverter extends Converter<Address, AddressDto> {

    @Override
    public AddressDto convert(Address entity) {
        return AddressDto.builder().id(Long.valueOf(entity.getId())).city(entity.getCity()).street(entity
                .getStreet())
                .houseNumber
                (entity.getHouseNumber())
                .build();
    }
}
