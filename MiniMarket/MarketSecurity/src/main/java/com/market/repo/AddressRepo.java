package com.market.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.market.entity.Address;

public interface AddressRepo extends JpaRepository<Address, Integer>{

	void deleteById(int id);
}
