package com.ACM.models;

import java.util.ArrayList;

public class Company extends Customer {
	
	public Company(String name, String address) {
		super(name, address);
	}

	public void chargeAllAccounts(double amount) {
		ArrayList<Account> accounts = this.getAccounts();
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i) instanceof SavingsAccount) {
				accounts.get(i).withdraw(2 * amount);
			}
			else if (accounts.get(i) instanceof CheckingAccount) {
				accounts.get(i).withdraw(amount);
			}
		}
	}
}
