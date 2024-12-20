/*
*(#) AccountServiceImpl.java  1.0    Dec 20, 2024
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

import com.fit.OnThiWWW20.entities.Account;
import com.fit.OnThiWWW20.repositories.AccountRepository;
import com.fit.OnThiWWW20.services.AccountService;
@Service
public class AccountServiceImpl implements AccountService {
	@Autowired
	private AccountRepository accountRepository;
	
	@Override
	public List<Account> getAllAccounts() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public List<Account> getAccountsInRange(double balanceFrom, double balanceTo) {
		// TODO Auto-generated method stub
		return accountRepository.findAccountsInRange(balanceFrom, balanceTo);
	}

}
