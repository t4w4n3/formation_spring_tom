package com.example.demotom;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TomController {

	final private DireBonjour tomService;
	final private DireBonjour direBonjour;

	public TomController(DireBonjour direBonjour, DireBonjour tomService, @Value("${maproperties}") String xdsufgeysch) {
		this.direBonjour = direBonjour;
		this.tomService = tomService;
	}

	@GetMapping("/hello")
	public String coucou() {
		return direBonjour.coucou();
	}

	@GetMapping("/hello2")
	public String coucou2() {
		return tomService.coucou();
	}

	@PostMapping("/{name}")
	public Long addName(@PathVariable String name) {
		return tomService.addName(name);
	}
}
