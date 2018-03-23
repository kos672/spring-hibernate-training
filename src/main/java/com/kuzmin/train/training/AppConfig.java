package com.kuzmin.train.training;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.kuzmin.train.training.business", "com.kuzmin.train.training.configuration"})
public class AppConfig {
}
