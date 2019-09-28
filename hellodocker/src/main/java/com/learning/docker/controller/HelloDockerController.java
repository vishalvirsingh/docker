package com.learning.docker.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloDockerController {

	@RequestMapping("/hellodocker")
	public String welcomeToDocker() {
		return "Welcome to Docker world!!!!";
	}


}
