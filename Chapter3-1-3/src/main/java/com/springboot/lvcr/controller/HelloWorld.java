package com.springboot.lvcr.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorld {
	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

	@RequestMapping("/")
	public String index(ModelMap map) {
		map.addAttribute("host", "http://blog.didispace.com");
		return "index";
	}

}
