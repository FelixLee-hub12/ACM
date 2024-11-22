package com.ACM.models;
import java.util.ArrayList;

public abstract class Customer {
	private long CUSTOMER_ID;
	private static long nextCustomerId = 2000000;
	private String name;
	private String address;
	private ArrayList<Account> accounts;
	
	public Customer(String name, String address) {
		this.name = name;
		this.address = address;
		this.CUSTOMER_ID = nextCustomerId;
		nextCustomerId += 7;
	}
	
	public abstract void chargeAllAccounts(double amount);
	
	public void addAccount(Account account) {
		this.accounts.add(account);
	}
	
	public void removeAccount(Account account) {
		this.accounts.remove(account);
	}
	
	
	public ArrayList<Account> getAccounts() {
		return this.accounts;
	}
	
	public long getCUSTOMER_ID() {
		return this.CUSTOMER_ID;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	
}
