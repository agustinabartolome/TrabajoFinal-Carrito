package com.example.carritocompras;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication()

@ComponentScan(basePackages = "com.netsurfingzone.*")
@EntityScan("com.netsurfingzone.*")
@EnableJpaRepositories(basePackages = "com.netsurfingzone.repository")

public class CarritocomprasApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarritocomprasApplication.class, args);
	}

}
