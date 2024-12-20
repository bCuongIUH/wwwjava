/*
*(#) Account.java  1.0    Dec 20, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.entities;

import com.fit.OnThiWWW20.enums.AccountStatus;

import jakarta.persistence.*;
import jakarta.persistence.Table;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 20, 2024
* @version: 1.0
*/

@Entity
@Table(name = "account")
public class Account {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "acc_balance")
	private double balance;
	
	@Column(name = "acc_status")
	@Enumerated(EnumType.ORDINAL)
	private AccountStatus status;
	
	@ManyToOne
	@JoinColumn(name = "cust_id")
	private Customer customer;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public AccountStatus getStatus() {
		return status;
	}

	public void setStatus(AccountStatus status) {
		this.status = status;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Account(double balance, AccountStatus status, Customer customer) {
		super();
		this.balance = balance;
		this.status = status;
		this.customer = customer;
	}

	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", status=" + status + ", customer=" + customer + "]";
	}
	
	
	
	
}
