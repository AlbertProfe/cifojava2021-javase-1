package wordsoperations;

import java.util.Random;
//import java.util.Scanner;

public class AccountManagment {
	// scope #3

	// ----------------------------------------------
	// ---------  INICIO DEL TRABAJO ----------------
	// ----------------------------------------------

	public static void createAccount(String userToCreateAccount) {
		// scope #4

		String user = createUser(userToCreateAccount);
		String email = createEmail(userToCreateAccount);
		String password = createPassword();
		printUserAccount(user, email, password);
	}

	// ------------------------------------------------
	// ----------- HARRAMIENTAS ----------------------
	// ------------------------------------------------

	public static String createUser(String createUser) {
		// scope #5

		int blank = createUser.indexOf(" ");
		String user = createUser.substring(0, blank);

		return user;
	}

	public static String createEmail(String createEmail) {
		// scope #6

		int blank = createEmail.indexOf(" ");
		String surname = createEmail.substring(blank + 1, createEmail.length());
		String email = createEmail.charAt(0) + surname + "@java.com";

		return email;
	}

	public static String createPassword() {
		// scope #7

		String password = "";

		password = password + createCharRandom() + createIntRandom(10000) + createCharRandom() + createCharRandom()
				+ createIntRandom(596);

		return password;
	}

	public static void printUserAccount(String user, String email, String password) {
		// scope #8

		System.out.println("User Account: ");
		System.out.println("User : " + user);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	// ------------------------------------------------
	// ----------- MAS HARRAMIENTAS -------------------
    // ------------------------------------------------

	public static int createIntRandom(int top) {
		// scope #9
		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		// scope #9
		// Random rand = new Random();
		// String alphabetChars =
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";
		String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

		return charRandom;

	}

}
