package test;
import java.util.Scanner;
public class Test {
	//scope number #1

	public static void main(String[] args) {
		//scope number #2
		
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
		
		if (userType.equals("vip")) {
			//scope number #3
			
			// i have to code 25% discount
			//and print it to screen
			System.out.println("\nTicket:");
			System.out.println("-------------------------\n");
			System.out.println("The amount of your buy is: " + userBuy );
			System.out.println("Your discount is: " + "25%" );
			System.out.println("Your total discout is: " );
			System.out.println("Your should pay: "  );
			
			
		} else {
			//scope number #4
			System.out.println(userName + " is NOT a vip user");
		}
		

	}

	
	public static void methodtotestscope() {
		//scope number #5
		// here i don't see variables from other scopes
		//userName <<<< i don't see this variable from scope #2
		//reader <<<< i don't see this variable from scope #2
		
	}
}
