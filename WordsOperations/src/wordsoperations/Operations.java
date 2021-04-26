package wordsoperations;

public class Operations {

	public static void print(String wordtoPrint) {

		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {

		System.out.print(chartoPrint);
	}

	public static void linebreak() {
		System.out.print("\n");
	}

	public static void printString(String wordtoPrint) {

		int i = 0;
		linebreak();
		int sizeWordtoPrint = wordtoPrint.length();
		while (i < sizeWordtoPrint) {
			print("loop number: " + (i + 1) + " - " );
			
			print("letter: " + wordtoPrint.charAt(i));
			linebreak();

			i++; // i = i +1;

		}

	}
}
