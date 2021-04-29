package wordsoperations;

import java.util.Scanner;

public class AccountUpdating {

	public static String updateUser(Scanner reader, String user) {

		System.out.println("\nEnter user name to update: ");
		System.out.println("Old name: " + user);
		System.out.print("New name: ");
		String userConsole = reader.next();
		
		return userConsole;
		
	}

	public static String updateEmail(Scanner reader, String email) {
		
		System.out.println("\nEnter email  to update: ");
		System.out.println("Old email: " + email);
		System.out.print("New email: ");
		String emailConsole = reader.next();
		
		return emailConsole;
	}

	public static String updatePasswod(Scanner reader, String password) {

		return AccountCreation.createPassword();
	}

}
