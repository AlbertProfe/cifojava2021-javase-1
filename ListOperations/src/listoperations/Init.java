package listoperations;

import java.util.ArrayList;

public class Init {
	// scope #1
	public static void main(String[] args) {

		ArrayList<String> fruits;
		fruits = new ArrayList<String>();

		// ArrayList<Integer> oddNumbers = new ArrayList<Integer>();

		
		addToArray(fruits);
		containsToArray(fruits);
		removeFromArray(fruits);
		toStringArray(fruits);

	}

	public static void printArray(ArrayList<String> arrayToPrint) {

		System.out.println("Fruits:");

		for (String elementToPrint : arrayToPrint) {
			System.out.println(elementToPrint);
		}
		System.out.println("\n");

	}

	public static ArrayList<String> addToArray(ArrayList<String> arrayToAdd) {

		arrayToAdd.add("kiwi");
		arrayToAdd.add("mango");
		arrayToAdd.add("platano");
		arrayToAdd.add("pera");
		arrayToAdd.add("manzana");
		arrayToAdd.add("cereza");

		System.out.println("fruits add .... ");
		System.out.println("Size: " + arrayToAdd.size());
		System.out.println("is empty? " + arrayToAdd.isEmpty());
		printArray(arrayToAdd);

		return arrayToAdd;

	}

	public static ArrayList<String> containsToArray(ArrayList<String> arrayToContain) {

		System.out.println("fruits contains .... ");
		if (arrayToContain.contains("fresa")) {

			System.out.println("It exists!");
			System.out.println("Size: " + arrayToContain.size());
			printArray(arrayToContain);
		} else {

			arrayToContain.add("fresa");
			System.out.println("Added!!");

			System.out.println("Size: " + arrayToContain.size());
			printArray(arrayToContain);

		}
		System.out.println("\n");
		return arrayToContain;

	}

	public static ArrayList<String> removeFromArray(ArrayList<String> arrayFromRemove) {

		System.out.println("fruits remove .... ");
		arrayFromRemove.remove("platano");
		System.out.println("Size: " + arrayFromRemove.size());
		printArray(arrayFromRemove);
		System.out.println("\n");

		return arrayFromRemove;

	}

	public static ArrayList<String> toStringArray(ArrayList<String> arrayToString) {

		System.out.println("fruits toString .... ");
		String fruitsString = arrayToString.toString();
		System.out.println(fruitsString);

		return arrayToString;

	}

	public static ArrayList<String> clearArray(ArrayList<String> arrayToString) {

		System.out.println("fruits clear .... ");
		arrayToString.clear();

		System.out.println("fruits .... ");
		System.out.println("Size: " + arrayToString.size());
		System.out.println("is empty? " + arrayToString.isEmpty());
		printArray(arrayToString);

		return arrayToString;

	}

}
