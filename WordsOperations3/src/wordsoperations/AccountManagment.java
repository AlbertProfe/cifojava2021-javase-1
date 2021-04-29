package wordsoperations;

public class AccountManagment {
	// scope #3

	
	public static void createAccount(String userToCreateAccount) {
		// scope #4

		String user = AccountCreation.createUser(userToCreateAccount);
		String email = AccountCreation.createEmail(userToCreateAccount);
		String password = AccountCreation.createPassword();
		AccountCreation.printUserAccount(user, email, password);
	}

}
