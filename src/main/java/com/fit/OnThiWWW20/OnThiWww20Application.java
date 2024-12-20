package com.fit.OnThiWWW20;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.fit.OnThiWWW20.entities.Account;
import com.fit.OnThiWWW20.entities.Customer;
import com.fit.OnThiWWW20.enums.AccountStatus;
import com.fit.OnThiWWW20.repositories.AccountRepository;
import com.fit.OnThiWWW20.repositories.CustomerRepository;

import net.datafaker.Faker;

@SpringBootApplication
public class OnThiWww20Application {
@Autowired
	private AccountRepository accountRepository;
	@Autowired
	private CustomerRepository customerRepository;
	public static void main(String[] args) {
		SpringApplication.run(OnThiWww20Application.class, args);
	}

//	@Bean
//	CommandLineRunner initData() {
//		return args -> {
//			Faker faker = new Faker();
//			for (int i = 0; i < 3; i++) {
//				Customer customer = new Customer();
//				customer.setName(faker.name().fullName());
//				customer.setAddress(faker.address().fullAddress());
//				customer.setEmail(faker.internet().emailAddress());
//				Date dob = faker.date().birthday(18, 65);
//				LocalDate localDOB = dob.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//				customer.setDob(localDOB);
//				customerRepository.save(customer);
//			}
//
//			for (long i = 1; i <= 3; i++) {
//				Account account = new Account();
//				account.setBalance(100000);
//				account.setStatus(AccountStatus.CHECKED);
//				Customer customer = customerRepository.findById(i).get();
//				account.setCustomer(customer);
//				accountRepository.save(account);
//			}
//		};
//	}
}
