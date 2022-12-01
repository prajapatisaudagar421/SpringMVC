package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	@RequestMapping("/youtube")
	public String service() {
		return "service";
	}
}
