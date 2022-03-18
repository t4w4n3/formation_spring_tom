package com.example.demotom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;

@Service
public class TomService implements DireBonjour {

	private final TestRepository repository;
	private final TawaneService tawaneService;

	private final Logger logger = LoggerFactory.getLogger(TawaneService.class);

	private final EntityManager entityManager;

	public TomService(TestRepository repository, TawaneService tawaneService, EntityManager entityManager) {
		this.repository = repository;
		this.tawaneService = tawaneService;
		this.entityManager = entityManager;
	}

	@Override
	public String coucou() {
		return "Hello !";
	}

	@Override
	public Long addName(String name) {
		logger.info("addName(" + name + ")");
 		TestEntity entity = new TestEntity();
		entity.setName(name);
		logger.info("Id : " + entity.getId());
		logger.info("Name : " + entity.getName());
		entity = tawaneService.writeTestEntity(entity);
		logger.info("Id : " + entity.getId());
		logger.info("Name : " + entity.getName());
		return entity.getId();
	}


}
