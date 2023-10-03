package com.market.controller;

import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.market.entity.User;
import com.market.repo.CartRepository;
import com.market.service.ServiceClass;

@Controller
public class HomeController {
	@Autowired
	private ServiceClass sc;
	@Autowired
	private CartRepository cr;

	@GetMapping("/")
	public String indexx(Model m) {

		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "index";
	}

	@PostMapping("/add_user")
	public String saveData(@ModelAttribute User user, HttpSession session) {
		
		
		if(user.getPs().equals(user.getCps())) {
			try {
				sc.saveData(user);
				session.setAttribute("msg", "Registration successfully...!");
			} catch (Exception e) {
				// TODO: handle exception
				session.setAttribute("msg", "Something Wrong on server");

			}	
		}
		else {
		
			session.setAttribute("password","password not match");
		
		}

		

		return "redirect:/regi.html";
	}

	@GetMapping("/login.html")
	public String singup() {

		return "login";
	}
}

/*
 * @GetMapping("/") public String registration() {
 * 
 * return "registrartion"; }
 * 
 * @PostMapping("/regi") public String regii(@ModelAttribute User user) {
 * sc.saveData(user); return "registrartion"; }
 * 
 * @GetMapping("/home") public String home() {
 * 
 * return "home"; }
 * 
 * 
 * @GetMapping("/signup") public String singup() {
 * 
 * return "login";
 */
