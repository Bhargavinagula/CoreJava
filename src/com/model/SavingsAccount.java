package com.model;
public  class SavingsAccount extends Account{
	private static final double MINIMUM_BALANCE = 1000;
	public SavingsAccount(String accountNumber , Customer customer ,double intialdeposit) {
	super(accountNumber, customer, intialdeposit);
}

	@Override
	public boolean withdraw(double amount) {
		 if (balance >= amount) {
	            balance -= amount;
	            System.out.println(amount +"Amount withdraw success");
	            return true;
	            
	
	}
		 System.out.println("sorry trancation failed due to insuffient balance");
		 return false;
	}
}
