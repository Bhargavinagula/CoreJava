package com.controller;
import java.util.Scanner;
import com.service.BankingService;
public class BankingManagementSystem {
	public static void main(String[] args) {
		BankingService bservice = new BankingService();
		Scanner scanner = new Scanner(System.in);
		int service = 0;
		while(true) {
              System.out.println("****** 1. Create Customer                  *********");
              System.out.println("****** 2. Create Account                   **********");
              System.out.println("****** 3. Deposit Amount                   **********");
              System.out.println("****** 4. Withdraw Amount                  **********");
              System.out.println("****** 5. Check Balance                    **********");
              System.out.println("****** 6. View Customers Accounts          **********");
              System.out.println("****** 7. Exit                             **********");
              service = scanner.nextInt();
              switch(service) {
              case 1:
            	  System.out.println("Enter Customer id:");
            	  String id = scanner.next();
            	  System.out.println("Enter Customer name:");
            	  String name = scanner.next();
            	  bservice.createCustomer(id, name);
            	  break;
              case 2:
            	  System.out.println("Enter Account Type:");
            	  String type = scanner.next();
            	  System.out.println("Enter Account Number:");
            	  String acc_number = scanner.next();
            	  System.out.println("Enter Customer ID:");
            	  String cus_id = scanner.next();
            	  System.out.println("Enter Initial Deposit Amount:");
            	  double amount = scanner.nextDouble();
            	  bservice.createAccount(type, acc_number, cus_id, amount);
            	  break;
              case 3:
            	  System.out.println("Enter Account Number:");
            	  String dep_acc_no = scanner.next();
            	  System.out.println("Enter Amount:");
            	  double dep_amount = scanner.nextDouble();
            	  bservice.deposit(dep_acc_no, dep_amount);
            	  break;
              case 4:
            	  System.out.println("Enter Account Number:");
            	  String with_Acc_no = scanner.next();
            	  System.out.println("Enter Amount to withdraw:");
            	  double with_amount = scanner.nextDouble();
            	  bservice.withdraw(with_Acc_no, with_amount);
            	  break;
              case 5:
            	  System.out.println("Enter Account Number:");
            	  String check_acc_number = scanner.next();
            	  bservice.checkBalance(check_acc_number);
            	  break;
              case 6:
            	  bservice.getAccounts();
            	  break;
              case 7:
            	  System.exit(1);
            	  break;
            	  default:
            		  System.out.println("Please enter valid choice:");
            		  break;
            	  
              }
              
              
		}
	

	}

}