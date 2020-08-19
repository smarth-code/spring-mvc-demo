package com.home.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {
	
	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeup() {
		return "ok...here is your Makeup kit";
	}
	
	@ResponseBody
	@RequestMapping("/books")
	public String getBooks() {
		return "here is your Books";
	}
}
