package com.ACM.models;

import java.util.ArrayList;

public class Person extends Customer {
	
	public Person(String name, String address) {
		super(name, address);
	}
	
	public void chargeAllAccounts(double amount) {
		ArrayList<Account> accounts = this.getAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			accounts.get(i).withdraw(amount);
		}
	}
}
