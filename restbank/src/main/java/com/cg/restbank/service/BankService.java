package com.cg.restbank.service;

import java.util.Collection;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.restbank.dao.BankDAO;
import com.cg.restbank.pojo.BankAccount;
@RestController
public class BankService {
	BankDAO dao = new BankDAO();
	
	public void populateAccount() {
		dao.populateAccount();
	}
	@RequestMapping(value="/viewAccount" )
	public Collection<BankAccount> viewAccount() {
		Collection<BankAccount> bank= dao.viewAllAccount();
		return bank;
	}

}
