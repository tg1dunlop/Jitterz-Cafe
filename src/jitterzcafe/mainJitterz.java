package jitterzcafe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class mainJitterz {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		String userName = "";
		int userInput = 0;
		// int userSelection = 1;
		String answer = "y";
		double stotal = 0;
		

		System.out.println("Welcome to Jitterz Cafe!");
		System.out.println("May I have your name? ");
		userName = scan1.nextLine(); // store name

		ArrayList<Product> prodlist = new ArrayList<Product>();
		// Category, Description, Menu item, price
		prodlist.add(new Product(userName, "Coffee", "Iced Coffee", "a", 3.50));
		prodlist.add(new Product(userName, "Coffee", "Decaf Coffee", "b", 2.50));
		prodlist.add(new Product(userName, "Coffee", "Regular Coffee", "c", 2.00));
		prodlist.add(new Product(userName, "Lattes", "Regular", "r", 3.50));
		prodlist.add(new Product(userName, "Lattes", "Flavored", "f", 2.50));
		prodlist.add(new Product(userName, "Lattes", "Decaf Mocha", "c", 2.00));
		prodlist.add(new Product(userName, "Pastries", "Beignet", "bg", 3.50));
		prodlist.add(new Product(userName, "Pastries", "Scone", "s", 2.50));
		prodlist.add(new Product(userName, "Pastries", "Muffin", "m", 1.00));
		prodlist.add(new Product(userName, "After Hours", "Baileys", "y", 4.50));
		prodlist.add(new Product(userName, "After Hours", "Kahula", "k", 5.50));
		prodlist.add(new Product(userName, "After Hours", "Whiskey", "w", 9.00));

		System.out.println("Hello, " + userName
				+ ", what would you like to order today? Please enter item number from the menu:");
		System.out.println();
		
		while (answer.equalsIgnoreCase("y")) {
			// set up file paths
			Path filePath = Paths.get("menuItems.txt");
			File menuFile = filePath.toFile();
			// displaying the menu from MyProduct
			MyProduct.writeToFile(menuFile);
			MyProduct.readFile(menuFile);
			// displayMenu();

			userInput = scan1.nextInt();
			scan1.nextLine();
			int qty = 0;
			payment ct = new payment(qty, .06, "cash");

			switch (userInput) {
			case 1:
				System.out.println("Please enter (a) for Iced coffee, (b) for Decaf, or (c) for Regular.");
				String Choice1 = scan1.nextLine();
				System.out.println("How many would you like? ");
				qty = scan1.nextInt();
				scan1.nextLine();
				stotal = displayCurTotal(scan1, ct, qty, stotal, prodlist, Choice1);
				break;
			case 2:

				System.out.println("Please enter (r) for Regular,  (f) for Flavored, or (dm) for Decaf Mocha.");
				Choice1 = scan1.nextLine();
				System.out.println("How many would you like? ");
				qty = scan1.nextInt();
				scan1.nextLine();
				stotal = displayCurTotal(scan1, ct, qty, stotal, prodlist, Choice1);
				break;
			case 3:
				System.out.println("Please enter (bg) for Beignet, (s) for Scone, or (m) for Muffin.");
				Choice1 = scan1.nextLine();
				System.out.println("How many would you like? ");
				qty = scan1.nextInt();
				scan1.nextLine();
				stotal = displayCurTotal(scan1, ct, qty, stotal, prodlist, Choice1);
				break;
			case 4:
				System.out.println("Please enter (y) for Baileys, (k) for Kahlua, or (w) for Whiskey.");
				Choice1 = scan1.nextLine();
				System.out.println("How many would you like? ");
				qty = scan1.nextInt();
				scan1.nextLine();
				stotal = displayCurTotal(scan1, ct, qty, stotal, prodlist, Choice1);
				break;

			default:
				break;

			} // end of switch

			System.out.println("Would you like to add to this order? Y or N");
			answer = scan1.nextLine();
			if (answer.equalsIgnoreCase("n")) {
				//display receipt
				//ct.getOrderReceipts();
				//for (int j = 0; j < receipt.size(); j++) 
				
				System.out.println(ct.getGrandTotal(qty, stotal));

			}

		} // end of loop

		System.out.println("Thank you for visiting Jitterz Cafe, " + userName + ". Please come again!");

	}// end main

	private static double displayCurTotal(Scanner scan1, payment ct, int qty, double stotal,
			ArrayList<Product> prodlist, String choice1) {
		for (int i = 0; i < prodlist.size(); i++) {
			if ((prodlist.get(i).getMenuItem().equals(choice1))) {
				stotal += ct.getSubtotal(qty, prodlist.get(i).getPrice());
				
				//ct.setOrderReceipt(prodlist.get(i).getDescription() , prodlist.get(i).getPrice());
				System.out.println("Your subtotal = " + stotal);

			} // end of if

		} // end for loop
		switch (choice1) {
		case "a":
			System.out.println("You have ordered " + qty + " Iced Coffee.");
			break;
		case "b":
			System.out.println("You have ordered " + qty + " Decaf Coffee.");
			break;
		case "c":
			System.out.println("You have ordered " + qty + " Regular Coffee.");
			break;
		case "r":
			System.out.println("You have ordered " + qty + " Regular Latte.");
			break;
		case "f":
			System.out.println("You have ordered " + qty + " Flavored Latte.");
			break;
		case "dm":
			System.out.println("You have ordered " + qty + " Decaf Mocha Latte.");
			break;
		case "bg":
			System.out.println("You have ordered " + qty + " Beignet.");
			break;
		case "s":
			System.out.println("You have ordered " + qty + " Scone.");
			break;
		case "m":
			System.out.println("You have ordered " + qty + " Muffin.");
			break;
		case "y":
			System.out.println("You have ordered " + qty + " Baileys.");
			break;
		case "k":
			System.out.println("You have ordered " + qty + " Kahula.");
			break;
		case "w":
			System.out.println("You have ordered " + qty + " Whiskey.");
			break;
		}// end of switch
		return stotal;
	}

}
