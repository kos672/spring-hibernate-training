package com.kuzmin.train.training.business.human;

import com.kuzmin.train.training.business.address.AddressConverter;
import com.kuzmin.train.training.business.abstracts.Converter;
import com.kuzmin.train.training.business.job.JobConverter;
import com.kuzmin.train.training.business.model.Human;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HumanConverter extends Converter<Human, HumanDto> {

    private AddressConverter addressConverter;
    private JobConverter jobConverter;

    @Autowired
    public HumanConverter(AddressConverter addressConverter, JobConverter jobConverter) {
        this.addressConverter = addressConverter;
        this.jobConverter = jobConverter;
    }

    @Override
    public HumanDto convert(Human entity) {
        return HumanDto.builder().id(Long.valueOf(entity.getId())).name(entity.getName()).surname(entity.getSurname())
                .age(entity
                .getAge())
                .address(entity.getAddress().getId()).job(entity.getJob().getId())
                .build();
    }
}
