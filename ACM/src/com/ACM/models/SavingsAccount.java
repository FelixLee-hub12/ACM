package com.ACM.models;

public class SavingsAccount extends Account {
	private double interestRate;
	
	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double withdraw(double amount) {
		if (amount > this.balance) return 0;
		this.correctBalance(this.balance - amount);
		return amount;
	}
	
	public void addInterest() {
		double interestDue = this.balance * this.interestRate / 100;
		this.correctBalance(interestDue + this.balance);
	}

	@Override
	public void correctBalance(double amount) {
		this.balance = amount;
	}
}
