package wordsoperations;

import java.util.Scanner;

public class Init {
	// scope #1
	public static void main(String[] args) {

		// scope #2
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type user (name and surname) to create Account ...");
		String userToCreateAccount = reader.nextLine();

		
		
		String account = AccountManagment.createAccount(userToCreateAccount);
		
		//System.out.println(account);
		
		String user = Utils.fromStringToUser (account);
		String password = Utils.fromStringToPassword (account);
		
		
		boolean  isValidated  =  Login.validateAccount (reader, user, password);
		
		
		if (isValidated) {
			
			//to-do
			//AccountUpdating
			//AccountDeleting
			
			isValidated = false;
		}
		
		System.out.println("\nBye bye my friend...");
		reader.close();
	}

	

}
