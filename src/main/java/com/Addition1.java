package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Addition1 {
	
	@GetMapping("/addition1")
	public int add1() {
		int a=5; int b=5;
		return a+b;
	}
	
}