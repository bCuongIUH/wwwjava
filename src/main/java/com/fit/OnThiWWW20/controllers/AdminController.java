/*
*(#) AdminController.java  1.0    Dec 21, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fit.OnThiWWW20.entities.Customer;
import com.fit.OnThiWWW20.services.CustomerService;

/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 21, 2024
* @version: 1.0
*/
@Controller
public class AdminController {
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/report2")
	public String getCustomersByYear(Model model) {
		List<Customer> customers = customerService.getCustomerByYear(2002);
		model.addAttribute("customers", customers);
		return "report2";
	}
}
