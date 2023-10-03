 package com.market.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import com.market.entity.Product;
import com.market.entity.User;
import com.market.repo.CartRepository;

@Controller
//New
//@RequestMapping("/user/")
public class PagesController {

	@Autowired
	private CartRepository cr;

	@GetMapping("/Atta.html")
	public String index1(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "Atta";
	}

	@GetMapping("/Candy.html")
	public String index2(Model m) {

		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "Candy";
	}

	@GetMapping("/chatni.html")
	public String index3(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "Chatni";
	}

	@GetMapping("/Laddoo.html")
	public String index4(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "Laddoo";
	}

	@GetMapping("/masala.html")
	public String index5(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "masala";
	}

	@GetMapping("/Snacks.html")
	public String index6(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "Snacks";
	}

//new

	@GetMapping("/user/checkout.html")
	public String index8(Model m, User user) {
		// find all products from cart
		List<Product> lst = cr.findAll();
		m.addAttribute("cart_data", lst);

		// find how many rows are avilable
		long count = cr.count();
		m.addAttribute("cart_count", count);

		// Get all total prices
		List<Double> lst1 = cr.getAllPrise();
		double final_value = 0;

		// run loop for add the all price
		for (int i = 0; i < lst1.size(); i++) {
			System.out.println(lst1.get(i));
			final_value = final_value + lst1.get(i);
		}
		// optional
		System.out.println(final_value);
		m.addAttribute("cart_value", final_value);

		// addind shipping cahrge
		int shipping = 40;
		m.addAttribute("shipping_value", shipping);
		// shipping charge + final value
		double final_price = shipping + final_value;
		m.addAttribute("final_price", final_price);

		return "user/checkout";
	}

	@GetMapping("/detail.html")
	public String index10(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "detail";
	}

	@GetMapping("/more.html")
	public String index11(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "more";
	}

	@GetMapping("/index.html")
	public String index12(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "index";
	}

	@GetMapping("/regi.html")
	public String index13(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "regi";
	}

	@GetMapping("/contact.html")
	public String index14(Model m) {
		long count = cr.count();
		m.addAttribute("cart_count", count);
		return "contact";
	}
	@GetMapping("/user/delete_ooo/index.html")
	public String index15() {
		return "index.html";
	}
	
}
