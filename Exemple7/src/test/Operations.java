package test;

import java.util.Scanner;

public class Operations {
	// scope number #7
	public static void clientBuyProcess() {
		// scope number #3
		int discount = 0, totalDiscount, amountToPay;
	
		while (true) {
			// scope #4
			Scanner reader = new Scanner(System.in);
			System.out.println("Tell me your user name (\"quit\" to exit):");
			String userName = reader.nextLine();

			if (userName.equals("quit")) break;

			System.out.println("Tell me your type of user:");
			String userType = reader.nextLine();

			System.out.println("Tell me the amount of your buy:");
			int userBuy = reader.nextInt();

			System.out.println("\nUser:");
			System.out.println("-------------------------\n");
			System.out.println("User Name: " + userName);
			System.out.println("User Type: " + userType);
			System.out.println("User Buy: " + userBuy);

			if (userType.equals("vip") || userType.equals("regular") || userType.equals("new")) {

				if (userType.equals("vip")) discount = 25;
				if (userType.equals("regular"))	discount = 15;
				if (userType.equals("new")) discount = 1;
				
				totalDiscount = userBuy * discount / 100;
				amountToPay = userBuy - totalDiscount;
				printTicket(userBuy, discount, totalDiscount, amountToPay);
				
			} else System.out.println("\nPlease, you have to write \"vip\", \"regular\" or \"new\".\nTry another time ...\n");
		
			// I am closing the while so also the while scope
		}
		
		

	}

	private static void printTicket(int userBuy, int discount, int totalDiscount, int amountToPay) {
		// scope number #5
		System.out.println("\nTicket:");
		System.out.println("-------------------------\n");
		System.out.println("The amount of your buy is: " + userBuy);
		System.out.println("Your discount is: " + discount + "% of the total amount bought");
		System.out.println("Your total discount is: " + totalDiscount);
		System.out.println("You should pay (with the discount): " + amountToPay);
		System.out.println("You should pay (with taxes): " + addTax(amountToPay) + "\n");

	}

	private static double addTax(int amountToPay) {
		// scope number #6
		double tax = 0.21;

		// i am doing an EXPLICIT casting to be able to use amountToPay as a DOUBLE
		// double taxToPay = (double) amountToPay * tax;

		// i don't need an EXPLICIT casting cause taxToPay is double so it has ...
		// decimals...
		double taxToPay = amountToPay * tax;
		System.out.println("You should pay taxes: " + taxToPay);

		double amountToPayWithTaxes = amountToPay + taxToPay;

		return amountToPayWithTaxes;

	}

}
