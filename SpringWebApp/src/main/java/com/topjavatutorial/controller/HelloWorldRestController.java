package com.topjavatutorial.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class HelloWorldRestController {
	@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello(){
		return "Rest Hello World using Spring";
	}
}
