# cifojava2021-javase-1
Java SE exercises: Word Operations, to practise static methods and classes

Welcome to the cifojava2021-javase-1 wiki!

### WordsOpertations

just few exercises of strings: class operations and editing (subString, indexOf, length, etc)

### WordsOpertations2

refactor WordsOperations to emailManagement

`public class AccountManagment {
	// scope #3

	// ----------------------------------------------
	// ---------  INICIO DEL TRABAJO ----------------
	// ----------------------------------------------

	public static void createAccount(String userToCreateAccount) {
		// scope #4

		String user = createUser(userToCreateAccount);
		String email = createEmail(userToCreateAccount);
		String password = createPassword();
		printUserAccount(user, email, password);
	}

	// ------------------------------------------------
	// ----------- HARRAMIENTAS ----------------------
	// ------------------------------------------------

	public static String createUser(String createUser) {
		// scope #5

		int blank = createUser.indexOf(" ");
		String user = createUser.substring(0, blank);

		return user;
	}

	public static String createEmail(String createEmail) {
		// scope #6

		int blank = createEmail.indexOf(" ");
		String surname = createEmail.substring(blank + 1, createEmail.length());
		String email = createEmail.charAt(0) + surname + "@java.com";

		return email;
	}

	public static String createPassword() {
		// scope #7

		String password = "";

		password = password + createCharRandom() + createIntRandom(10000) + createCharRandom() + createCharRandom()
				+ createIntRandom(596);

		return password;
	}

	public static void printUserAccount(String user, String email, String password) {
		// scope #8

		System.out.println("User Account: ");
		System.out.println("User : " + user);
		System.out.println("Email: " + email);
		System.out.println("Password: " + password);

	}

	// ------------------------------------------------
	// ----------- MAS HARRAMIENTAS -------------------
    // ------------------------------------------------

	public static int createIntRandom(int top) {
		// scope #9
		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		// scope #9
		// Random rand = new Random();
		// String alphabetChars =
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";
		String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

		return charRandom;

	}

}`

### WordsOpertations3

create serveral classes to order emailManagement functionality:

>  * AccountCreation.java 
>  * AccountDeleting.java (to-do)
>  * AccountManagment.java 
>  * AccountUpdating.java (to-do)
>  * Init.java
>  * Utils.java

just empty classes to implement, so to-do: AccountDeleting.java and AccountUpdating.java

### WordsOpertations4

we define our **init** as a kind of controller that tells us what to execute and most important, the order of execution (sync):

`public class Init {`
	`// scope #1`
	`public static void main(String[] args) {`

		`// scope #2
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Type user (name and surname) to create Account ...");
		String userToCreateAccount = reader.nextLine();
		
		String account = AccountManagment.createAccount(userToCreateAccount);
		
		//System.out.println(account);
		
		String user = Utils.fromStringToUser (account);
		String password = Utils.fromStringToPassword (account);
		
		boolean  isValidated  =  Login.validateAccount (reader, user, password);
		
		if (isValidated) {
			
			//to-do
			//AccountUpdating
			//AccountDeleting
			
			isValidated = false;
		} 
		
		System.out.println("\nBye bye my friend...");
		reader.close();
	}`

	

`}`

and we add a new functionality so we need a new class: **login.java**

>  * AccountCreation.java
>  * AccountDeleting.java (to-do)
>  * AccountManagment.java
>  * AccountUpdating.java (to-do)
>  * Init.java
>  * Login.java (to-do)
>  * Utils.java

### WordsOpertations5

we implement login class and methods:

`String user = Utils.fromStringToUser (account);`
`String password = Utils.fromStringToPassword (account);`

`public static boolean validateAccount(Scanner reader, String user, String password) {

		//System.out.println(user);
		//System.out.println(password);

		int count = 1;
		String userConsole;
		String passwordConsole;
		System.out.println("\nLogin:");

		do {

			System.out.println("\nEnter Username : ");
			userConsole = reader.next();

			System.out.println("Enter Password : ");
			passwordConsole = reader.next();

			if (userConsole.equals(user) && passwordConsole.equals(password)) {
				System.out.println("Access Granted! Welcome!");
				return true;

			} else if (userConsole.equals(user)) {
				System.out.println("Invalid Password!");
			} else if (passwordConsole.equals(password)) {
				System.out.println("Invalid Username!");
			} else {
				System.out.println("Invalid Username & Password!");
			}
			
			System.out.println("Total attempts: " + count + "/3");
			count++;

			if (count == 4) System.out.println("Account blocked!");
			
		} while (count < 4);
		
		

		return false;
	}`



### WordsOpertations6

we implement update class

### WordsOpertations7

we implement delete class

### WordsOpertations8

we migrate from `String` **account** (toString with _user_, _email_ and _password_ strings)

to `ArrayList<String>` **account** (arryList wiht four positions, 0, 1, 2 and 3 with _name&surname_, _user_, _email_, _password_)

we need to change some classes:

### WordsOpertations9

final writing, comments and create Controller class in order to clean Init class

`package wordsoperations;

import java.util.ArrayList;
import java.util.Scanner;

public class Init {
	// scope #1
	public static void main(String[] args) {

		Controller.AppStarting();

		System.out.println("\nBye bye my friend...");

	}
}`

