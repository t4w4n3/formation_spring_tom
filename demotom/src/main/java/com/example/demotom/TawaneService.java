package com.example.demotom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TawaneService implements TestEntityWriter {

	private final Logger logger = LoggerFactory.getLogger(TawaneService.class);


	private final TestRepository testRepository;

	public TawaneService(TestRepository testRepository) {
		this.testRepository = testRepository;
	}

	@Transactional
	public TestEntity writeTestEntity(TestEntity entity) {
		entity = testRepository.save(entity);
		logger.info("Id : " + entity.getId());
		logger.info("Name : " + entity.getName());
		return entity;
	}
}
