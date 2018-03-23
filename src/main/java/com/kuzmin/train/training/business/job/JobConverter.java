package com.kuzmin.train.training.business.job;

import com.kuzmin.train.training.business.abstracts.Converter;
import com.kuzmin.train.training.business.model.Job;
import org.springframework.stereotype.Component;

@Component
public class JobConverter extends Converter<Job, JobDto> {

    @Override
    public JobDto convert(Job entity) {
        return JobDto.builder().id(Long.valueOf(entity.getId())).title(entity.getTitle()).department(entity
                .getDepartment()).build();
    }
}
