package com.example.controller;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class ControllerOne {
	@RequestMapping("/h")
	public String index() {
	    return "Hello World";
	}
 
}
