package com.example.demo.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

	@RequestMapping("/web")
	public Object page() {

		return "index.html";

	}
}
