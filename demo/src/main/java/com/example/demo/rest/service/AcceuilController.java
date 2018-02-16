package com.example.demo.rest.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcceuilController {
	@RequestMapping( value = "/acceuil")
	public String home() {
	    return "Hello World!";
	}

}
