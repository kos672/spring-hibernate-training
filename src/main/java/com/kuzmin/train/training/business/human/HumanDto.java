package com.kuzmin.train.training.business.human;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@ToString
public class HumanDto {

    private long id;
    private String name;
    private String surname;
    private int age;
    private long address;
    private long job;

}
