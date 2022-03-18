package com.example.demotom;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class TestEntity {

	private Long id;
	private String name;

	public void setId(Long id) {
		this.id = id;
	}

	@Id
	@GeneratedValue
	public Long getId() {
		return id;
	}

	@ManyToMany
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
