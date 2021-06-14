package com.nucleus.cricket.fever.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class LandingController {

	@RequestMapping("/test")
	public String hello() {
		return "welcome";
	}

}
