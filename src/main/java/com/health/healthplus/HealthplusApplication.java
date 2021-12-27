package com.health.healthplus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages={"com.health.healthplus"})
@EnableJpaRepositories("com.health.healthplus")
@EntityScan(basePackages="com.health.healthplus.*")  
public class HealthplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthplusApplication.class, args);
	}

}
