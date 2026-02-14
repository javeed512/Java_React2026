package com.hexaware.atm;

import java.util.Scanner;


/*
 * 
 * @author: Akash
 * UI Development
 * 
 */

public class AtmUI {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		

		System.out.println("******WELCOME TO ATM*******");

		boolean flag = true;

		while (flag) {

			System.out.println("1. DEPOSIT");
			System.out.println("2. WITHDRAW");
			System.out.println("3. EXIT");
			
		int choice =	scanner.nextInt();
		
			IBank bank =	BankUtil.getObject(); // Abstraction

			switch (choice) {
			case 1:
				
				// deposit
				
				bank.deposit();

				break;

			case 2:
				
				// withdraw
				
				bank.withdraw();

				break;

			case 3:
				
				flag = false;
				
				System.out.println("Thank you visit again..");
				

				break;

			default:
				
				
				System.err.println("Invalid option");
				
				break;
			}

		}

	}

}
