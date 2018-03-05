package com.ajit.SpringRestJpaJsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({"/com.*"})
@EnableJpaRepositories({"/com.*"})
@EntityScan({"/com.*"})
@SpringBootApplication
public class SpringRestJpaJspApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestJpaJspApplication.class, args);
	}
}
