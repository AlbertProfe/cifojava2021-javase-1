package wordsoperations;

public class Operations {
	// scope #8
	// int pepe = 19;

	public static void print(String wordtoPrint) {
		// scope #3
		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {
		// scope #4
		System.out.print(chartoPrint);
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
		// scope #9
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
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
			print(wordtoPrint.charAt(i));
			linebreak();
			i++; // i = i +1;
		}
	}

	public static void printStringHDash(String wordtoPrint) {
		// scope #11
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			print(wordtoPrint.charAt(i));
			print(" - ");
			i++; // i = i +1;
		}
		linebreak();
	}

	public static void printStringVOffset(String wordtoPrint) {
		// scope #12

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {

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

	public static void printStringDiagonal (String wordtoPrint) {
		// scope #12
		
		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();

		while (i < sizeWordtoPrint) {
			int j = 0;
			while (j < i) {
				print(" ");print(" ");
				j++;
			}
			print(wordtoPrint.charAt(i));
			linebreak();
			
			i++; // i = i +1;
		}

	linebreak();
}}
