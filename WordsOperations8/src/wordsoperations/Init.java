package wordsoperations;

import java.util.ArrayList;
import java.util.Scanner;

public class Init {
	// scope #1
	public static void main(String[] args) {

		// scope #2
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type user (name and surname) to create Account ...");
		String userToCreateAccount = reader.nextLine();

		ArrayList <String> account =  new ArrayList<String>();
		
		account.add(userToCreateAccount);
		
		account = AccountManagment.createAccount(account);
		
		boolean  isValidated = Login.validateAccount (reader, account);
		
		if (isValidated) {
			
			Utils.printArray(account);
			
			account  = AccountUpdating.updateUser(reader, account);
			account = AccountUpdating.updateEmail(reader, account);
			account = AccountUpdating.updatePasswod(reader, account);
			
			Utils.printArray(account);
			
			//fake deleting ...
			account = AccountDeleting.deleteAccount(account);
			
			Utils.printArray(account);
			isValidated = false;
		}
		
		System.out.println("\nBye bye my friend...");
		reader.close();
	}

	

}
