package com.market.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "keep_in_touch")
public class Connect_with {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "user_name", nullable = false)
	private String name;
	@Column(nullable = false)
	private String emial;
	@Column(nullable = false)
	private String sub;
	@Column(nullable = false)
	private String msg;

	@Column(nullable = false)

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmial() {
		return emial;
	}

	public void setEmial(String emial) {
		this.emial = emial;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Connect_with(String name, String emial, String sub, String msg) {
		super();
		this.name = name;
		this.emial = emial;
		this.sub = sub;
		this.msg = msg;
	}

	public Connect_with() {
		super();
		// TODO Auto-generated constructor stub
	}

}
