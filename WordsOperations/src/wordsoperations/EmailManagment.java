package wordsoperations;

import java.util.Random;
//import java.util.Scanner;

public class EmailManagment {
	// scope #25
	
	public static void createAccount(String word) {
		// scope #26
		// testRandom();
		
		String user = createUser(word);
		createEmail(word);
		createPassword();
		printUserAccount();
	}

	public static String createUser(String word) {
		// scope #28
		// to-do
		return word;
	}

	public static String createEmail(String word) {
		// scope #29
		// to-do
		return word;
	}

	public static String createPassword() {
		// scope #30
		// to-do
		String password = "";
		return password;
	}

	public static void printUserAccount() {
		// scope #31
		// to-do
	}

	public static int createIntRandom(int top) {
		// scope #32
		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		// scope #33
		// Random rand = new Random();
		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars.charAt(createIntRandom(alphabetChars.length()));

		return charRandom;

	}
	
	public static void testRandom() {
		// scope #27
		String password = "_";

		int count = 0;
		while (count < 5) {
			int i = createIntRandom(10000);
			char j = createCharRandom();

			password = password + i + j;

			System.out.println(password);
			count++;

		}

		System.out.println(createIntRandom(1500));
		System.out.println(createCharRandom());
		System.out.println(createIntRandom(200));
		System.out.println(createCharRandom());

	}
}
