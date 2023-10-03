package com.market.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.market.entity.Product;
import com.market.repo.CartRepository;

@Controller
public class CartController {
	@Autowired
	CartRepository cartRepository;

	@PostMapping("/api/cart/add")
	public void addToCart(@RequestBody Product product) {
		/*
		 * System.out.println(product.getName());
		 * System.out.println(product.getImageLink());
		 * System.out.println(product.getPrice());
		 * System.out.println(product.getQuantity());
		 * System.out.println(product.getTotal());
		 */
		cartRepository.save(product);
		

	}
}
