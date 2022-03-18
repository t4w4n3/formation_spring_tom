package com.example.demotom;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TestRepository extends CrudRepository<TestEntity, Long> {

	List<TestEntity> findAllByNameContains(String subname);

	@Query("""
			SELECT t.name FROM TestEntity t WHERE t.name LIKE '%?1%'
			""")
	List<TestEntity> coucou(String subname);

}
