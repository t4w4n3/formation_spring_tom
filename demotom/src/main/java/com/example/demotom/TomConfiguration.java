package com.example.demotom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManager;

@Configuration
public class TomConfiguration {

	@Bean
	public DireBonjour direBonjour(TestRepository repository, TawaneService tawaneService, EntityManager entityManager) {
		return new TomService(repository, tawaneService, entityManager);
	}
}
