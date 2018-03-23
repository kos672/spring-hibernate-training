package com.kuzmin.train.training.business.address;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AddressDto {

    private long id;
    private String city;
    private String street;
    private int houseNumber;

}
