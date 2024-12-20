/*
*(#) CustomerServiceImpl.java  1.0    Dec 20, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.services.impl;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 20, 2024
* @version: 1.0
*/

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fit.OnThiWWW20.entities.Customer;
import com.fit.OnThiWWW20.repositories.CustomerRepository;
import com.fit.OnThiWWW20.services.CustomerService;
@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}
	@Override
	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Không tìm thấy customer"));
	}
	@Override
	public List<Customer> getCustomerByYear(int year) {
		// TODO Auto-generated method stub
		return customerRepository.getCustomerByYear(year);
	}

}
