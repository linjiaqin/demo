package com.example.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class ControllerOne {
	@RequestMapping("/")
	public String start() {
 
		return "hello";
 
	}
 
}