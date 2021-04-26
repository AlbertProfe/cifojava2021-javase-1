package wordsoperations;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {

		
		Scanner reader = new Scanner (System.in);
		System.out.println("Write some string ...");
		String word = reader.nextLine();
		
		Operations.print(word);
		Operations.linebreak();
		Operations.printString(word);
		
		
		System.out.println("Bye bye my friend...");
		
		
		
	}

}


