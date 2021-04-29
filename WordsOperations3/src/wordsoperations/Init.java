package wordsoperations;

import java.util.Scanner;

public class Init {
	// scope #1
	public static void main(String[] args) {

		// scope #2
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type user (name and surname) to create Account ...");
		String userToCreateAccount = reader.nextLine();

		AccountManagment.createAccount(userToCreateAccount);
		
		System.out.println("\nBye bye my friend...");
		reader.close();
	}

	

}
