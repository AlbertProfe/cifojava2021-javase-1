package wordsoperations;

public class Operations {
	// scope #22
	// int pepe = 19;

	public static void operationsString(String word) {
		// scope #21
		print(word);
		linebreak();
		printString(word);
		printStringH(word);
		printStringV(word);
		printStringHDash(word);
		printStringVOffset(word);
		printStringDiagonal(word);
		printStringBackWards(word);

	}
	
	public static void print(String wordtoPrint) {
		// scope #3
		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {
		// scope #4
		System.out.print(chartoPrint);
	}
	
	public static void print(int intToPrint) {
		// scope #3
		System.out.print(intToPrint);
	}

	public static void linebreak() {
		// scope #5
		System.out.print("\n");
	}

	public static void printString(String wordtoPrint) {
		// scope #6
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			// scope #7
			print("counter: " + (i) + " - ");
			print("loop number: " + (i + 1) + " - ");
			print("letter: " + wordtoPrint.charAt(i));
			linebreak();

			i++; // i = i +1;
		}
	}

	public static void printStringH(String wordtoPrint) {
		// scope #8
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			// scope #9
			print(wordtoPrint.charAt(i));
			print(" ");
			i++; // i = i +1;
		}
		linebreak();
	}

	public static void printStringV(String wordtoPrint) {
		// scope #10
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			// scope #11
			print(wordtoPrint.charAt(i));
			linebreak();
			i++; // i = i +1;
		}
	}

	public static void printStringHDash(String wordtoPrint) {
		// scope #12
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			// scope #13
			print(wordtoPrint.charAt(i));
			if (i < (sizeWordtoPrint - 1) ) print(" - ");
			
			i++; // i = i +1;
		}
		linebreak();
	}

	public static void printStringVOffset(String wordtoPrint) {
		// scope #14

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			// scope #8
			print(" ");
			print(" ");
			print(" ");
			print(" ");
			print(" ");
			print(wordtoPrint.charAt(i));
			linebreak();

			i++; // i = i +1;
		}
		linebreak();
	}

	public static void printStringDiagonal(String wordtoPrint) {
		// scope #16

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			// scope #17
			int blanktoprint = 0;
			while (blanktoprint < i) {
				// scope #18
				print(" ");
				print(" ");
				print(" ");
				blanktoprint++;
			}

			print(wordtoPrint.charAt(i));
			linebreak();

			i++; // i = i +1;
		}

		linebreak();
	}

	public static void printStringBackWards(String wordtoPrint) {
		// scope #19
		
		linebreak();
		int i = wordtoPrint.length() -1 ;

		while ( i > -1) {
			// scope #20
			
			print(wordtoPrint.charAt(i));
			print(" ");
			i--; 
		}
		linebreak();
	}

}