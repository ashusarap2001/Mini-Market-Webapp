package com.market.service;

import com.market.entity.Address;
import com.market.entity.Connect_with;
import com.market.entity.HelpClass;
import com.market.entity.User;

public interface ServiceInterface {
	public User saveData(User user);

	public void contactToUser(HelpClass help);

	public void connectWith(Connect_with conn);

	public Address saveAddress(Address address);

	public boolean checkEmail(String email);

}
