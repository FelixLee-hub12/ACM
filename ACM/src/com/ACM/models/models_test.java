package com.ACM.models;

public class models_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This is test case file");
		
		SavingsAccount savings1 = new SavingsAccount();
        SavingsAccount savings2 = new SavingsAccount();
        CheckingAccount checking1 = new CheckingAccount();

        // Test if each account gets a unique ID
        System.out.println(String.format("savings1: %d,  savings2: %d, checking1: %d\n", savings1.getAccountID(), savings2.getAccountID(), checking1.getAccountID()));
        assert savings1.getAccountID() != savings2.getAccountID() : "Account IDs for SavingsAccount instances are not unique!";
        assert savings2.getAccountID() != checking1.getAccountID() : "Account IDs for SavingsAccount and CheckingAccount instances are not unique!";

        System.out.println("Test passed: Unique account IDs are assigned correctly.");
        
        
        
        // test if the balance updates correctly after deposit
        savings1.deposit(1000);
        checking1.deposit(1000);
        
        assert savings1.getBalance() == 1000.0 : "Deposit did not update the balance correctly!";
        assert checking1.getBalance() == 1000 : "Deposit did not update the balance correctly!";
        
        System.out.println("Test passed: Deposit functionality works correctly.");
        
        
        // test withdrawal on accounts
        savings2.deposit(300);
        double amount1 = savings1.withdraw(700);
        double amount2 = savings2.withdraw(700);
        double amount3 = checking1.withdraw(400);
        
        
        assert amount1 == 700 : "amount wrongly returned!";
        assert amount2 == 0 : "amount wrongly returned!";
        assert amount3 == 400 : "amount wrongly returned!";

        assert savings1.getBalance() == 300 : "withdrawal did not update the balance correctly!";
        assert savings2.getBalance() == 300 : "withdrawal did not update the balance correctly!";
        assert checking1.getBalance() == 600 : "withdrawal did not update the balance correctly!";
        
        checking1.withdraw(700);
        assert checking1.getBalance() == -100 : "withdrawal did not update the balance correctly!";
        System.out.println("Test passed: Withdrawal functionality for SavingsAccount works correctly.");
        
        
        // test interest
        savings1.correctBalance(1000);
        savings1.setInterestRate(5);
        
        savings1.addInterest();
        assert savings1.getBalance() == 1050 : "Interest calculation or addition is incorrect!";
        System.out.println("Test passed: Adding interest in SavingsAccount works correctly.");
        
        
        // test check num
        assert checking1.getNextCheckNumber() == 1 : "First check number is incorrect!";
        assert checking1.getNextCheckNumber() == 2 : "Second check number is incorrect!";
        assert checking1.getNextCheckNumber() == 3 : "Third check number is incorrect!";
        
        System.out.println("Test passed: Check number functionality in CheckingAccount works correctly.");
	}

}
