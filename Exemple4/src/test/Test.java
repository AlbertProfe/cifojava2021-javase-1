package test;

import java.util.Scanner;

public class Test {
	// scope number #1
	// public double vipClientDiscount = 25.00;
	// public double regularClientDiscount = 15.00;
	// public double newCientDiscount = 00.00;

	public static void main(String[] args) {
		// scope number #2

		while (true) {
			// scope #6
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
			
			int discount = 0;
			int totalDiscount = 0;
			int amountToPay = 0;
			
			if (userType.equals("vip")) {
				// scope number #3
				// i have to code 25% discount

			} else if (userType.equals("regular")) {
				// scope number #7
				// i have to code 15% discount
				
			} else if (userType.equals("new")) {
				// scope number #8
				// i have to code 0% discount
				
			} else {
				// scope number #9
				
			}
			// + "25%"
			// + (userBuy * 25 / 100)
			// + (userBuy - (userBuy * 25 / 100)) + "\n"
			System.out.println("\nTicket:");
			System.out.println("-------------------------\n");
			System.out.println("The amount of your buy is: " + userBuy);
			System.out.println("Your discount is: " + discount);
			System.out.println("Your total discount is: " + totalDiscount);
			System.out.println("Your should pay (with the discount): " + amountToPay + "\n");

			// I am closing the while so also the while scope
		}

	}

	public static void methodToTestScope() {
		// scope number #5
		// here i don't see variables from other scopes
		// userName <<<< i don't see this variable from scope #2
		// reader <<<< i don't see this variable from scope #2

	}
}
