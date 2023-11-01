package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/practice")
public class HelloController {
	@GetMapping("/get")
	String getData(@RequestParam String name) {
		return "Hello " + name;
	}

}
