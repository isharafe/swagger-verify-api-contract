package com.ruchira.learn.flyway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {

	@GetMapping("/hello/{name}")
	public String sayHello(@PathVariable String name) {
		return String.format("Hello %s !", name);
	}
}
