/*
*(#) UserController.java  1.0    Dec 20, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.fit.OnThiWWW20.entities.Account;
import com.fit.OnThiWWW20.entities.Customer;
import com.fit.OnThiWWW20.services.AccountService;
import com.fit.OnThiWWW20.services.CustomerService;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 20, 2024
* @version: 1.0
*/
@Controller
public class UserController {
	@Autowired
	private CustomerService customerService;

	@Autowired
	private AccountService accountService;
	@GetMapping("/list-customer")
	public String listCustomer(Model model) {
		List<Customer> customers = customerService.getAllCustomers();
		model.addAttribute("customers", customers);
		return "customers";

	}

	@GetMapping("/customer-detail/{id}")
	public String getCustomerById(Model model, @PathVariable("id") long id) {
		Customer customer = customerService.getCustomerById(id);
		model.addAttribute("customer123", customer);
		return "cust_details";
	}
	
	@GetMapping("/report1")
	public String getAllAccounts(Model model, @RequestParam(value = "balanceFrom", required = false) Double balanceFrom,
			@RequestParam(value = "balanceTo", required = false) Double balanceTo) {
		List<Account> accounts;
		if (balanceFrom != null && balanceTo != null) {
			accounts = accountService.getAccountsInRange(balanceFrom, balanceTo);
		} else {
			accounts = accountService.getAllAccounts();
		}
		model.addAttribute("accounts", accounts);
		return "report1";
	}
}
