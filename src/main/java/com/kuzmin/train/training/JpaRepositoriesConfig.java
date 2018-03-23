package com.kuzmin.train.training;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.kuzmin.train.training.repository")
public class JpaRepositoriesConfig {
}
