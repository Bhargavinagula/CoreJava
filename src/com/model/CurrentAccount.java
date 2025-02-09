package com.model;

public class CurrentAccount extends Account {
	private static final double OVERDREAFTLIMIT = 5000.00;

	public CurrentAccount(String accountnumber, Customer customer, double initialDeposit) {
		super(accountnumber, customer, initialDeposit);
	}

	@Override
	public boolean withdraw(double amount) {
		if (balance - amount >= OVERDREAFTLIMIT) {
			balance -= amount;
			System.out.println(amount + " withdraw success");
			return true;
		}
		System.out.println("Sorry Transaction failed due to exceeding Overdraft Limit");
		return false;
	}

}