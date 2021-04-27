package wordsoperations;

import java.util.Random;
//import java.util.Scanner;

public class EmailManagment {

	public static void createAccount(String word) {

		
		//testRandom();

	}

	public static void testRandom() {
		
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
	
	public static String createUser (String word) {
		// to-do
		return word;}
	
	public static String createEmail (String word) {
		// to-do
		return word;}
	
	public static String createPassword () {
		// to-do
		String password = "";
		return password;}
	
	public static void printUserAccount () {
		// to-do
		}

	public static int createIntRandom(int top) {

		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		return rand.nextInt(top);

	}

	public static char createCharRandom() {

		Random rand = new Random();
		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars.charAt(createIntRandom(alphabetChars.length()));

		return charRandom;

	}

}
