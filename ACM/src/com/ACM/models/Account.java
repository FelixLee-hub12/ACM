package com.ACM.models;

public abstract class Account {
	private static long nextAccountId = 1000;
	private long ACCOUNT_ID;
	protected double balance;
	
	public Account() {
		this.balance = 0;
		this.ACCOUNT_ID = nextAccountId;
		nextAccountId += 5;
	}
	

	public double getBalance() {
		return this.balance;
	}

	public double withdraw(double amount) {
		this.balance -= amount;
		return amount;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public long getAccountID() {
		return this.ACCOUNT_ID;
	}
	
	public abstract void correctBalance(double amount);
	
}
