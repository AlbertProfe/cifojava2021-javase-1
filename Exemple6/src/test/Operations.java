package test;

import java.util.Scanner;

public class Operations {
	
	public static void clientBuyProcess() {
		// scope number #3
		int discount = 0;
		int totalDiscount = 0;
		int amountToPay = 0;

		while (true) {
			// scope #4
			Scanner reader = new Scanner(System.in);
			System.out.println("Tell me your user name:");
			String userName = reader.nextLine();

			System.out.println("Tell me your type of user:");
			String userType = reader.nextLine();

			System.out.println("Tell me the amount of your buy:");
			int userBuy = reader.nextInt();

			System.out.println("\nUser:");
			System.out.println("-------------------------\n");
			System.out.println("User Name: " + userName);
			System.out.println("User Type: " + userType);
			System.out.println("User Buy: " + userBuy);

			if (userType.equals("vip")) {
				// scope number #5
				discount = 25;
				totalDiscount = userBuy * 25 / 100;
				amountToPay = userBuy - totalDiscount;
				printTicket(userBuy, discount, totalDiscount, amountToPay);

			} else if (userType.equals("regular")) {
				// scope number #6
				discount = 15;
				totalDiscount = userBuy * 15 / 100;
				amountToPay = userBuy - totalDiscount;
				printTicket(userBuy, discount, totalDiscount, amountToPay);

			} else if (userType.equals("new")) {
				// scope number #7
				discount = 0;
				totalDiscount = userBuy * 0 / 100;
				amountToPay = userBuy - totalDiscount;
				printTicket(userBuy, discount, totalDiscount, amountToPay);

			} else {
				// scope number #8
				System.out.println("Please, you have to write \"vip\", \"regular\" or \"new\". Try another time ...");
			}

			// I am closing the while so also the while scope
		}

	}

	public static void printTicket(int userBuy, int discount, int totalDiscount, int amountToPay) {
		// scope number #9
		System.out.println("\nTicket:");
		System.out.println("-------------------------\n");
		System.out.println("The amount of your buy is: " + userBuy);
		System.out.println("Your discount is: " + discount + "% of the total amount buoght");
		System.out.println("Your total discount is: " + totalDiscount);
		System.out.println("Your should pay (with the discount): " + amountToPay);
		System.out.println("Your should pay (with taxes): " + addTax(amountToPay) + "\n");
		
		
	}

	public static double addTax (int amountToPay) {
		// scope number #10
		double tax = 0.21;
		
		//i am doing an EXPLICIT casting to be able to use amountToPay as a DOUBLE
		//double taxToPay = (double) amountToPay * tax;
		//System.out.println(taxToPay);
				
		//i don't need an EXPLICIT casting cause taxToPay is double so it has ... decs...
		double taxToPay =  amountToPay * tax;
		
		double amountToPayWithTaxes = amountToPay + taxToPay;
		
		return  amountToPayWithTaxes ;
		
	}

}
