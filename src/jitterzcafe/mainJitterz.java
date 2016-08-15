package jitterzcafe;

import java.util.Scanner;

public class mainJitterz {

	public static void main(String[] args) {
Scanner scan1 = new Scanner(System.in);
int userInput = 0;
System.out.println("Welcome to Jitterz-Cafe!");
//display menu
System.out.println("Menu: Coffee - enter 1, Muffin - enter 2");
System.out.println("What would you like to order?  Please enter the menu item number: ");
userInput = scan1.nextInt();
scan1.nextLine();
System.out.println("You entered: " + userInput);
	}

}
