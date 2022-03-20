package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {

	public static void main(String[] args) {

//		Create Scanner for user inputs
		Scanner sc = new Scanner(System.in);
		
//		This is an introductory statement explaining what the application does.
		System.out.println("Enter the cost of an item, the currency tendered, and receive back the number and denomination of currency to be returned in change.");
		System.out.println();
		
//		User Story #1
//		The user is prompted asking for the price of the item.
		double cost = 0;
		System.out.print("Enter the cost of the item: ");
		cost = sc.nextDouble();
//		TODO: Remove next line after testing
//		System.out.println(cost);

//		Clean out the Scanner
		sc.nextLine();
		
		
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
		double tender = 0;
		System.out.print("Enter the amount tendered: ");
		tender = sc.nextDouble();
//		TODO: Remove next line after testing
//		System.out.println(tender);
		
//		TODO: Remove next line after testing;
		System.out.println(tender - cost);
		
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer
		if (tender > cost) {
			double diff = tender - cost;
			int tenBills = (int)((diff - (diff % 10.0))/10);
			diff -= tenBills * 10;
//			TODO: Remove next line
			System.out.println("tenBills: " + tenBills);
			System.out.println(diff);
			int fiveBills = (int)((diff - (diff % 5.0))/5.0);
			diff -= fiveBills * 5;
//			TODO: Remove next line
			System.out.println("fiveBills: " + fiveBills);
			System.out.println(diff);
			int oneBills = (int)((diff - (diff % 1.0)));
			diff -= oneBills;
//			TODO: Remove next line
			System.out.println("oneBills: " + oneBills);
			System.out.println(diff);
			int quarters = (int)((diff - (diff % 0.25))/0.25);
			diff -= quarters * 0.25;
//			TODO: Remove next line
			System.out.println("Quarters: " + quarters);
			System.out.println(diff);
			int dimes = (int)((diff - (diff % 0.10))/10);
			diff -= dimes;
//			TODO: Remove next line
			System.out.println("Dimes: " + dimes);
			System.out.println(diff);
			int nickels = (int)((diff - (diff % 0.05))/0.05);
			diff -= nickels;
//			TODO: Remove next line
			System.out.println("Nickels: " + nickels);
			System.out.println(diff);
			int pennies = (int)(Math.round(diff * 100));
			diff -= pennies;
//			TODO: Remove next line
			System.out.println("Pennies: " + pennies);
//			TODO: Remove next ilne after testing;
			System.out.println(tender - cost);

			if (diff > 0.0) {
			
				if (tenBills > 0) {
					System.out.println("$10 x " + tenBills);
				}
				if (fiveBills > 0) {
					System.out.println(" $5 x " + fiveBills);
				}
				if (oneBills > 0) {
					System.out.println(" $1 x " + oneBills);
				}
				if (quarters > 0) {
					String quartersOutput = ("25\u00A2" + " x " + Integer.toString(quarters));
					System.out.println(quartersOutput);
				}
				if (dimes > 0) {
					System.out.println("10\u00A2 x " + dimes);
				}
				if (nickels > 0) {
					System.out.println(" 5\u00A2 x " + nickels);
				}
				if (pennies > 0) {
					System.out.println(" 1\u00A2 x " + pennies);
				}
			}
		}

//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.
		if (tender < cost) {
			System.out.println("The amount tendered is not enough. Please run program again and provide additonal currency.");
		} else if (tender == cost) {
			System.out.println("The amount tendered is exactly the cost of the item.  No change will be tendered.");
		}
		

	}

}
