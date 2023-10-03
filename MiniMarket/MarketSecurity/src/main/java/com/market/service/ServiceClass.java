package com.market.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.market.entity.Address;
import com.market.entity.Connect_with;
import com.market.entity.HelpClass;
import com.market.entity.User;
import com.market.repo.AddressRepo;
import com.market.repo.CartRepository;
import com.market.repo.Connect_User;
import com.market.repo.HelpUserRepo;
import com.market.repo.UserRepo;

@Service
public class ServiceClass implements ServiceInterface {
	@Autowired
	private UserRepo up;
	@Autowired
	private HelpUserRepo cr;
	@Autowired
	private Connect_User conn;
	@Autowired
	private AddressRepo ap;



	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User saveData(User user) {
		// TODO Auto-generated method stub
		user.setPs(passwordEncoder.encode(user.getPs()));
		user.setCps(passwordEncoder.encode(user.getCps()));
		user.setRole("ROLE_USER");
		return up.save(user);
	}

	@Override
	public void contactToUser(HelpClass help) {
		// TODO Auto-generated method stub
		cr.save(help);

	}

	@Override
	public void connectWith(Connect_with con) {
		// TODO Auto-generated method stub
		conn.save(con);

	}

	@Override
	public Address saveAddress(Address address) {
		// TODO Auto-generated method stub
		return ap.save(address);
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	}


