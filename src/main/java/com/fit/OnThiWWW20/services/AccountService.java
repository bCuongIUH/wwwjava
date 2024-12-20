/*
*(#) AccountService.java  1.0    Dec 20, 2024
*Copyright (c) 2024 IUH. All rights reserved.
*/
package com.fit.OnThiWWW20.services;
/*
* @description :
* @author: Bach Van Cuong
* @date:   Dec 20, 2024
* @version: 1.0
*/

import java.util.List;

import com.fit.OnThiWWW20.entities.Account;

public interface AccountService {
	List<Account> getAllAccounts();
	List<Account> getAccountsInRange(double balanceFrom, double balanceTo);
}
