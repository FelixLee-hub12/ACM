package com.ACM.controllers;

import java.util.ArrayList;
import com.ACM.models.*;

public class AccountController {
	private ArrayList<Customer> customers;
	private ArrayList<Account> accounts;
	
	public Customer createCustomer(String name, String address, String type) throws Exception {

		if (type.equals("person")) {
			Person person = new Person(name, address);
			customers.add(person);
			return person;
		} 
		else if (type.equals("company")) {
			Company company = new Company(name, address);
			customers.add(company);
			return company;
		} 
		else {
			throw new Exception("wrong type");
		}
	}
	
	public Account createAccount(Customer customer, String type) throws Exception {
		
		if (type.equals("checking")) {
			CheckingAccount account = new CheckingAccount();
			this.accounts.add(account);
			customer.addAccount(account);
			return account;
		} else if (type.equals("savings")) {
			SavingsAccount account = new SavingsAccount();
			this.accounts.add(account);
			customer.addAccount(account);
			return account;
		} else {
			throw new Exception("wrong type");
		}
	}
	
	public void removeCustomer(Customer customer) {
		// Assuming customer exists
		ArrayList<Account> accounts = customer.getAccounts();
		for (Account account: accounts) {
			this.accounts.remove(account);
		}
		this.customers.remove(customer);
	}
	
	public void removeAccount(Account account) {
		this.accounts.remove(account);
		for (Customer customer: this.customers) {
			if (customer.getAccounts().contains(account)) {
				customer.removeAccount(account);
				break;
			}
		}
	}
	
	public ArrayList<Customer> getCustomer() {
		return this.customers;
	}
	
	public ArrayList<Account> getAccounts() {
		return this.accounts;
	}
}
