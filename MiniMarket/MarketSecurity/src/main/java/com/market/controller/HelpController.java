package com.market.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.market.entity.HelpClass;
import com.market.service.ServiceClass;

@Controller
public class HelpController {
	@Autowired
	private ServiceClass sc;

	@PostMapping("/help")
	public String helpUserData(@ModelAttribute HelpClass help, HttpSession session) {
		try {
			sc.contactToUser(help);
			session.setAttribute("success", "Will Try To Help You");
	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			session.setAttribute("success", "Try Again");
		}
		return "index";
	}
}
