package wordsoperations;

import java.util.Scanner;

public class Init {
	// scope #1
	public static void main(String[] args) {

		// scope #2
		Scanner reader = new Scanner(System.in);
		System.out.println("Write some string ...");
		String word = reader.nextLine();

		//operationsString(word);
		Editing.subEditing (word);
		
		
		
		System.out.println("\nBye bye my friend...");

	}

	public static void operationsString(String word) {

		Operations.print(word);
		Operations.linebreak();
		Operations.printString(word);
		Operations.printStringH(word);
		Operations.printStringV(word);
		Operations.printStringHDash(word);
		Operations.printStringVOffset(word);
		Operations.printStringDiagonal(word);
		Operations.printStringBackWards(word);

	}

}
