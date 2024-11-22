package com.ACM.models;

public class CheckingAccount extends Account{
	private int nextCheckNumber = 1;

	public int getNextCheckNumber() {
		return nextCheckNumber++;
	}
	
	@Override
	public void correctBalance(double amount) {
		this.balance = amount;
	}
}
