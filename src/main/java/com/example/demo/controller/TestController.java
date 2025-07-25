package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/test")
public class TestController {

	@GetMapping("/hello")
	public String printHello() {
		return "Hello";
	}

	@GetMapping("/hello1")
	public String printHello1() {
		return "Hello sambit";
	}

	@GetMapping("/hello2")
	public String printHello2() {
		return "Hello sambit1";
	}
	@GetMapping("/hello3")
	public String printHello3() {
		return "Hello sambit sn";
	}
	@GetMapping("/hello4")
	public String printHello4(){
		return "Hello 4";
	}

}
