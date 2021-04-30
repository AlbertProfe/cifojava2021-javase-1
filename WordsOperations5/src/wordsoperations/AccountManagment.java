package wordsoperations;

public class AccountManagment {
	// scope #3

	
	public static String createAccount(String userToCreateAccount) {
		// scope #4

		String user = AccountCreation.createUser(userToCreateAccount);
		String email = AccountCreation.createEmail(userToCreateAccount);
		String password = AccountCreation.createPassword();
		AccountCreation.printUserAccount(user, email, password);
		
		String account = AccountCreation.accountToString(user, email, password);
		
		return account;
		
	}

}
