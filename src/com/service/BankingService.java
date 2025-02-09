package com.service;
import java.util.HashMap;
import com.model.Account;
import com.model.CurrentAccount;
import com.model.Customer;
import com.model.SavingsAccount;
public class BankingService {
HashMap<String, Customer> customers = new HashMap<String, Customer>();
HashMap<String, Account> accounts = new HashMap<String, Account>();
	public void createCustomer(String id, String name) {
		Customer customer = new Customer(id, name);
		customers.put(id, customer);
		System.out.println("Customer created Successfully...");
	}
	public void createAccount(String type, String acc_number, String cus_id, double amount) {
		if(customers.containsKey(cus_id)) {
			if(type.equalsIgnoreCase("Savings")) {
				accounts.put(acc_number, new SavingsAccount(acc_number, customers.get(cus_id), amount));
				System.out.println("Savings Account created for "+customers.get(cus_id).getName());
			}
			else if(type.equalsIgnoreCase("Current")) {
				accounts.put(acc_number, new CurrentAccount(acc_number, customers.get(cus_id), amount));
				System.out.println("Current Account created for "+customers.get(cus_id).getName());
			}
			else {
				System.out.println("Invalid Account Type:");
			}
		}
		else {
			System.out.println("Invalid Customer ID:");
		}
	}
	public void deposit(String dep_acc_no, double dep_amount) {
		if(accounts.containsKey(dep_acc_no)) {
			accounts.get(dep_acc_no).deposit(dep_amount);
			System.out.println("Amount deposited:");
			
		}
		else {
			System.out.println("Account number does not exist....");
		}
		
	}
	public void withdraw(String with_acc_no, double with_amount) {
		if(accounts.containsKey(with_acc_no)) {
			accounts.get(with_acc_no).withdraw(with_amount);
			System.out.println("Amount withdrwa");
		}
	}
	public void checkBalance(String check_acc_number) {
		if(accounts.containsKey(check_acc_number)) {
			accounts.get(check_acc_number);
			System.out.println(accounts.get(check_acc_number).getBalance());
		}
	}

	public void getAccounts() {
		System.out.println(accounts.values());
	}
		
	}