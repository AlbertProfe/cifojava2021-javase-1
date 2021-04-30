package wordsoperations;

import java.util.Scanner;

public class Init {
	// scope #1
	public static void main(String[] args) {

		// scope #2
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type user (name and surname) to create Account ...");
		String userToCreateAccount = reader.nextLine();

		boolean login = false;
		
		String account = AccountManagment.createAccount(userToCreateAccount);
		
		//System.out.println(account);
		
		String user = Utils.fromStringToUser (account);
		String email = Utils.fromStringToEmail (account);
		String password = Utils.fromStringToPassword (account);
		
		login = Login.logIn(reader, user, password);
		
		if (login) {
			
			
			user = AccountUpdating.updateUser(reader, user);
			email = AccountUpdating.updateEmail(reader, email);
			password = AccountUpdating.updatePasswod(reader, password);
			
			
			//fake deleting ...
			AccountDeleting.deleteAccount(user, email, password);
			
			login = false;
		}
		
		System.out.println("\nBye bye my friend...");
		reader.close();
	}

	

}
