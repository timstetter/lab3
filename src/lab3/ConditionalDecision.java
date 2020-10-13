package lab3;

import java.util.Scanner;

public class ConditionalDecision {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		System.out.print("Please enter your name: ");
		String userName = scnr.next();
		
		System.out.print("Enter an integer between 1 and 100 please " + userName + ": ");
		int userInt = scnr.nextInt();

		if (userInt < 1 || userInt > 100) {
			System.out.println("Number not between 1 and 100 " + userName);
			System.out.print("Enter an integer between 1 and 100 please, " + userName + ": ");
			userInt = scnr.nextInt();
		}
		
		if (userInt % 2 != 0  && userInt < 60) {
			System.out.println(userInt + " is Odd, " + userName);
		} else if (userInt % 2 == 0 && userInt >= 2 && userInt <= 25) {
			System.out.println(userInt + " is Even and less than 25, " + userName);
		} else if (userInt % 2 == 0 && userInt >= 26 && userInt <= 60) {
			System.out.println("Even, " + userName);
		} else if (userInt % 2 == 0 && userInt > 60) {
			System.out.println(userInt + " is Even, " + userName);
		} else if (userInt % 2 != 0 && userInt > 60) {
			System.out.println(userInt + " is Odd and over 60, " + userName);
		}
	
		scnr.close();
	}
}	
