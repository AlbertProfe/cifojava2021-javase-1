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

			if (userType.equals("vip")) {
				// scope number #3

				// i have to code 25% discount
				// and print it to screen
				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println(userName + " is a vip user\n");
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + "25%");
				System.out.println("Your total discout is: " + (userBuy * 25 / 100));
				System.out.println("Your should pay (with the discount): " + (userBuy - (userBuy * 25 / 100)) + "\n");

			} else {
				// scope number #4

				System.out.println("\nTicket:");
				System.out.println("-------------------------\n");
				System.out.println(userName + " is NOT a vip user\n");
				System.out.println("The amount of your buy is: " + userBuy);
				System.out.println("Your discount is: " + "0%");
				System.out.println("Your total discout is: " + "0");
				System.out.println("Your should pay (with the discount): " + userBuy + "\n");
			}

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
