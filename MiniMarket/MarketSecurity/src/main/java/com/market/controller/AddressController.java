package com.market.controller;

import java.time.LocalDate;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.market.entity.Address;
import com.market.repo.AddressRepo;
import com.market.repo.CartRepository;
import com.market.service.ServiceClass;

@Controller
@RequestMapping("/user")
public class AddressController {
	@Autowired
	private ServiceClass sc;
	@Autowired
	private AddressRepo ar;
	@Autowired
	private CartRepository cr;

	@PostMapping("/add")
	public String addAddress(Model m, @ModelAttribute Address address,HttpSession session)

	{
		sc.saveAddress(address);
		List<Address> lst = ar.findAll();
		m.addAttribute("add", lst);
		LocalDate today = LocalDate.now();
		String date = today.toString();
	
		m.addAttribute("dd", date);

		List<Double> lst1 = cr.getAllPrise();
		double final_value = 0;
		for (int i = 0; i < lst1.size(); i++) {
			
			final_value = final_value + lst1.get(i);
		}
		
		m.addAttribute("cart_value", final_value);
		int shipping = 40;

		double final_price = shipping + final_value;
		m.addAttribute("final_price", final_price);

		int upperBound = 99;
		Random random = new Random();
		int no = 0;
		int add = 0;
		for (int i = 0; i <= 4; i++) {
			no = random.nextInt(upperBound);
			add = add + no;
		}

			m.addAttribute("genrated_number", add);

		LocalDate tt = LocalDate.now();
		LocalDate dd = tt.plusDays(5);
		String delivery = dd.toString();
		m.addAttribute("datee", delivery);
		session.setAttribute("order","orderr");

		return "user/order_status";
	}
		}
