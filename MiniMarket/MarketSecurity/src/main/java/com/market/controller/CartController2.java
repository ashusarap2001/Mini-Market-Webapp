package com.market.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.market.entity.Product;
import com.market.entity.User;
import com.market.repo.AddressRepo;
import com.market.repo.CartRepository;

@Controller
public class CartController2 {
	@Autowired
	CartRepository cr;
	@Autowired
	private AddressRepo ar;

	@GetMapping("/user/cart.html")
	public String index7(Model m, User user) {
		List<Product> lst = cr.findAll();
		m.addAttribute("cart_data", lst);
		long count = cr.count();
		m.addAttribute("cart_count", count);

		List<Double> lst1 = cr.getAllPrise();
		double final_value = 0;
		for (int i = 0; i < lst1.size(); i++) {

			final_value = final_value + lst1.get(i);
		}

		m.addAttribute("cart_value", final_value);
		int shipping = 40;
		m.addAttribute("shipping_value", shipping);

		double final_price = shipping + final_value;
		m.addAttribute("final_price", final_price);
		// System.out.println("hello"+lst1);
		return "user/cart";

	}

	@GetMapping("/user/delete_item/{id}")
	public String delete_item(@PathVariable(value = "id") Long id, HttpSession session) {
		try {
			cr.deleteById(id);
			session.setAttribute("remove", "removed");

		} catch (Exception e) {

		}

		return "redirect:/user/cart.html";
	}
	
	//Cancel order controller
	
	@GetMapping("/user/delete_ooo/{id}")
	public String index6(@PathVariable(value = "id")int id ,HttpSession session) {
		ar.deleteById(id);
		session.setAttribute("cancel","cancel");
		return "user/cancel";
	}


}
