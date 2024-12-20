/*
*(#) Customer.java  1.0    Dec 20, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.entities;

import java.time.LocalDate;

import jakarta.persistence.*;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 20, 2024
* @version: 1.0
*/
@Entity
@Table(name = "customer")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "cus_name")
	private String name;
	@Column(name = "cus_add")
	private String address;
	@Column(name = "cus_email")
	private String email;
	@Column(name = "cus_dob")
	private LocalDate dob;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public Customer(String name, String address, String email, LocalDate dob) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.dob = dob;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", email=" + email + ", dob=" + dob
				+ "]";
	}
	
	
}
