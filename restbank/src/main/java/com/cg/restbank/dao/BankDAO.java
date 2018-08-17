package com.cg.restbank.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.cg.restbank.pojo.Customer;
import com.cg.restbank.pojo.BankAccount;
import com.cg.restbank.pojo.CurrentAccount;
import com.cg.restbank.pojo.SavingAccount;

public class BankDAO {
	Map<Integer, BankAccount> bankDb = new HashMap<>();
	CurrentAccount currentaccount;
	SavingAccount savingsaccount;
	
	public void populateAccount() {
		bankDb.put(101, new SavingAccount(new Customer("Alok", "alokrai697@gmail.com", "02/07/1997", "8176955507"), 101000, true));
		bankDb.put(102, new SavingAccount(new Customer("Alok", "alokrai697@gmail.com", "02/07/1997", "8176955507"), 150000, true));
		bankDb.put(103, new CurrentAccount(new Customer("Alok", "alokrai697@gmail.com", "02/07/1997", "8176955507"), 102000, 1000));
		bankDb.put(104, new CurrentAccount(new Customer("Alok", "alokrai697@gmail.com", "02/07/1997", "8176955507"), 130000, 1000));
		
	}
	
	public Collection<BankAccount> viewAllAccount(){
		System.out.println(bankDb.values());
		return bankDb.values();
	}

}
