package com.skilldistillery.makechange;

import java.util.Scanner;

public class CashRegister {
	
	public static void main(String[] args) {

//		Create Scanner for user inputs
		Scanner sc = new Scanner(System.in);
				;
//		This is an introductory statement explaining what the application does.
		System.out.println("Enter the cost of an item, the currency tendered, and receive back the number and denomination of currency to be returned in change.");
		System.out.println();
		
//		User Story #1
//		The user is prompted asking for the price of the item.
		double cost = 0;
		System.out.print("Enter the cost of the item: ");
		cost = sc.nextDouble();
		System.out.println(cost);
//		User Story #2
//		The user is then prompted asking how much money was tendered by the customer.
	//
//		User Story #3
//		Display an appropriate message if the customer provided too little money or the exact amount.
	//
//		User Story #4
//		If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer

	}

}
