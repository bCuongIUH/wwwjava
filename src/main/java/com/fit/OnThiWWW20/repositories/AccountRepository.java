/*
*(#) AccountRepository.java  1.0    Dec 20, 2024
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
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fit.OnThiWWW20.entities.Account;
@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	@Query("SELECT a FROM Account a WHERE a.balance BETWEEN :balanceFrom AND :balanceTo")
	List<Account> findAccountsInRange(@Param("balanceFrom") double balanceFrom, 
	                                  @Param("balanceTo") double balanceTo);

	
}
