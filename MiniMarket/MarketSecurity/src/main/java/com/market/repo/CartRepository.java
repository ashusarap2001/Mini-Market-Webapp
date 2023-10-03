package com.market.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.market.entity.Product;

public interface CartRepository extends JpaRepository<Product, Long> {
	List<Product> findAll();

	void deleteById(Long id);

	@Query("select u.total from cart u ")
	public List<Double> getAllPrise();
}
