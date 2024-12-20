/*
*(#) CustomerRepository.java  1.0    Dec 20, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.repositories;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 20, 2024
* @version: 1.0
*/

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.fit.OnThiWWW20.entities.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	@Query("SELECT c FROM Customer c WHERE YEAR(c.dob) = ?1")
	List<Customer> getCustomerByYear(int year);
}
