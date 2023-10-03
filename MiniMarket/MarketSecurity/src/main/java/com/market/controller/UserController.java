package com.market.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user/")
public class UserController {

	@GetMapping("/ashu")
	public String index3() {
		return "user/ashu";
	}

	@GetMapping("/index")
	public String index4() {
		return "index";
	}

	@GetMapping("contact.html")
	public String index5() {
		return "contact";

	}

	@GetMapping("index.html")
	public String inde6() {
		return "index";

	}

	@GetMapping("detail.html")
	public String index7() {
		return "detail";

	}
	

}