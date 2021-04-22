package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Scanner reader = new Scanner (System.in);
		System.out.println("Tell me your user name:");
		String userName = reader.nextLine();
		
		System.out.println("Tell me your type of user:");
		String userType = reader.nextLine();
		
		System.out.println("Tell me the amount of your buy:");
		int userBuy = reader.nextInt();
		
		System.out.println("\nUser:");
		System.out.println("-------------------------\n");
		System.out.println("User Name: " + userName );
		System.out.println("User Type: " + userType );
		System.out.println("User Buy: " + userBuy );
		

	}

}
