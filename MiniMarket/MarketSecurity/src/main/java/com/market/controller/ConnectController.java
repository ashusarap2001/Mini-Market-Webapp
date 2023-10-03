package com.market.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.market.entity.Connect_with;
import com.market.service.ServiceClass;

@Controller
public class ConnectController {
	@Autowired
	private ServiceClass sc;

	@PostMapping("/contact_us")
	public String connect(@ModelAttribute Connect_with conn, HttpSession session) {
		
		try {
			sc.connectWith(conn);
			session.setAttribute("connect", "We Will Contact you");
		} catch (Exception e) {
			e.printStackTrace();
			session.setAttribute("connect", "Try Agian");
		}
	
		return "contact";
	}
}
