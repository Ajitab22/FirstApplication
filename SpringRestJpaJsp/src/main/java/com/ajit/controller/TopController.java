package com.ajit.controller;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("topController")
public class TopController {
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("index");
		return "index";
	}
}
