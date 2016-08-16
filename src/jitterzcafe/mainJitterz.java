package jitterzcafe;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class mainJitterz {

	public static void main(String[] args) {

		Scanner scan1 = new Scanner(System.in);
		String userName = "";
		int userInput = 0;
		int userSelection = 1;
		System.out.println("Welcome to Jitterz-Cafe!");
		System.out.println("May I have your name? ");
		userName = scan1.nextLine(); // store name

		/*
		 * Path filePath = Paths.get("menuItems.txt"); File menuFile =
		 * filePath.toFile();
		 */

		// displaying the menu from MyProduct
		// MyProduct.writeToFile(menuFile);
		// MyProduct.readFile(menuFile);

		/*
		 * System.out.
		 * println("What would you like to order?  Please enter the menu item number: "
		 * ); System.out.println("Press category");
		 * System.out.println("Press description");
		 * System.out.println("Press price"); userInput = scan1.nextInt();
		 * scan1.nextLine();
		 */

		// create while loop for categories
		while (userSelection != 0) {
			System.out.println("Select '1' to order Coffee.");
			System.out.println("Select '2' to order Lattes.");
			System.out.println("Select '3' to order Pastries.");
			System.out.println("Select '4' for after hours specials!!");
			System.out.println("Select '0' to exit.");
			System.out.println();
			System.out.print("Please enter your selection: ");
			userSelection = scan1.nextInt();
			scan1.nextLine();

			// begin array formation
			Product[] orderArray = new Product[12];

			// create switch case for descriptions of chosen category
			switch (userSelection) {

			case 1:
				System.out.println("Please enter a for Iced coffee. b for Decaf. c for Regular");
				String coffeeChoice1 = scan1.nextLine();

				if (coffeeChoice1.equalsIgnoreCase("a")) {
					Product p1 = new Product(userName, "Coffee", "Iced Coffee", 1.00);
					System.out.println(p1.getName());
					orderArray[0] = p1;
				}
				if (coffeeChoice1.equalsIgnoreCase("b")) {
					Product p2 = new Product(userName, "Coffee", "decaf", 1.00);
					System.out.println(p2.getName());
					orderArray[0] = p2;
				}
				if (coffeeChoice1.equalsIgnoreCase("c")) {
					Product p3 = new Product(userName, "Coffee", "regular", 1.00);
					System.out.println(p3.getName());
					orderArray[0] = p3;
				}
				break;

			case 2: {
				System.out.println("Please enter a for Regular. b for Flavored. c for Decaf Mocha");
				String coffeeChoice2 = scan1.nextLine();

				if (coffeeChoice2.equalsIgnoreCase("a")) {
					Product p4 = new Product(userName, "lattes", "regular", 1.00);
					System.out.println(p4.getName());
					orderArray[0] = p4;
					//check if array is working
					// System.out.println(orderArray[0].getName());
					// System.out.println(orderArray[0].getPrice());

				}
				if (coffeeChoice2.equalsIgnoreCase("b")) {
					Product p5 = new Product(userName, "lattes", "flavored", 1.00);
					System.out.println(p5.getName());
					orderArray[0] = p5;
				}
				if (coffeeChoice2.equalsIgnoreCase("c")) {
					Product p6 = new Product(userName, "lattes", "decaf mocha", 1.00);
					System.out.println(p6.getName());
					orderArray[0] = p6;
				}
				break;
			}
			
			case 3: {
				System.out.println("Please enter a for Beignet. b for Scone. c for Muffin");
				String coffeeChoice3 = scan1.nextLine();

				if (coffeeChoice3.equalsIgnoreCase("a")) {
					Product p7 = new Product(userName, "pastries", "beignet", 1.00);
					System.out.println(p7.getName());
					orderArray[0] = p7;
				}
				if (coffeeChoice3.equalsIgnoreCase("b")) {
					Product p8 = new Product(userName, "pastries", "Scone", 1.00);
					System.out.println(p8.getName());
					orderArray[0] = p8;
				}
				if (coffeeChoice3.equalsIgnoreCase("c")) {
					Product p9 = new Product(userName, "pastries", "muffin", 1.00);
					System.out.println(p9.getName());
					orderArray[0] = p9;
				}
				break;
			}

			case 4: {
				System.out.println("Please enter a for Baileys. b for Kahlua. c for Whiskey");
				String coffeeChoice4 = scan1.nextLine();

				if (coffeeChoice4.equalsIgnoreCase("a")) {
					Product p10 = new Product(userName, "after hours", "baileys", 1.00);
					System.out.println(p10.getName());
					orderArray[0] = p10;
				}
				if (coffeeChoice4.equalsIgnoreCase("b")) {
					Product p11 = new Product(userName, "after hours", "kahlua", 1.00);
					System.out.println(p11.getName());
					orderArray[0] = p11;
				}
				if (coffeeChoice4.equalsIgnoreCase("c")) {
					Product p12 = new Product(userName, "after hours", "whiskey", 1.00);
					System.out.println(p12.getName());
					orderArray[0] = p12;
				}
				break;
			}

			default:
				System.out.println("Goodbye");
				break;
			}// end of switch
		} // end of while*/
		scan1.close();

	}
}// end of main

