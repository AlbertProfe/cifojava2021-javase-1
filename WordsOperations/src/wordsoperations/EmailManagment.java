package wordsoperations;

import java.util.Random;
import java.util.Scanner;

public class EmailManagment {

	public static void createAccount(Scanner reader) {

		System.out.println(createIntRandom(100));

	}

	public static int createIntRandom(int top) {

		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		return rand.nextInt(top);

	}

	public static char createCharRandom() {

		Random rand = new Random();
		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		
		// Generate random char in range 0 to top, if top=10 random 0 to 9
		
		
		return 'j';

	}

}
