package com.example.demo.business.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

	@RequestMapping("/web/{page}")
	public Object page() {

		return "index";

	}
	

	@RequestMapping("/")
	public Object indexpage() {

		return "index";

	}
}
