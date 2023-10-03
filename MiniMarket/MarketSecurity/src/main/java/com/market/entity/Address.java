package com.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address_data")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(nullable = false)
	private String fname;
	@Column(nullable = false)
	private String lname;
	@Column(nullable = false)
	private String mobile;
	@Column(nullable = false)
	private String a_mobile;
	@Column(nullable = false)
	private String add_1;
	@Column(nullable = false)
	private String add_2;
	@Column(nullable = false)
	private String country;
	@Column(nullable = false)
	private String city;
	@Column(nullable = false)
	private String state;
	@Column(nullable = false)
	private int pin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getA_mobile() {
		return a_mobile;
	}

	public void setA_mobile(String a_mobile) {
		this.a_mobile = a_mobile;
	}

	public String getAdd_1() {
		return add_1;
	}

	public void setAdd_1(String add_1) {
		this.add_1 = add_1;
	}

	public String getAdd_2() {
		return add_2;
	}

	public void setAdd_2(String add_2) {
		this.add_2 = add_2;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Address(int id, String fname, String lname, String mobile, String a_mobile, String add_1, String add_2,
			String country, String city, String state, int pin) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.mobile = mobile;
		this.a_mobile = a_mobile;
		this.add_1 = add_1;
		this.add_2 = add_2;
		this.country = country;
		this.city = city;
		this.state = state;
		this.pin = pin;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

}
