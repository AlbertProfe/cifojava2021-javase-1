package wordsoperations;

import java.util.Scanner;

public class Init {
	//scope #1
	public static void main(String[] args) {

		//scope #2
		Scanner reader = new Scanner (System.in);
		System.out.println("Write some string ...");
		String word = reader.nextLine();
		
		//Operations.print(word);
		//Operations.linebreak();
		//Operations.printString(word);
		Operations.printStringH(word);
		
		
		System.out.println("\nBye bye my friend...");
		
		
		
	}

}


