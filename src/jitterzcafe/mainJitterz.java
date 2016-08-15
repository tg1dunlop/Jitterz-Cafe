package jitterzcafe;
import java.io.File;
import java.nio.file.*;
import java.util.Scanner;

//import fileIoExercise.CountriesTextFile;

public class mainJitterz {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);
		int userInput = 0;
		System.out.println("Welcome to Jitterz-Cafe");
		//display menu
		Path filePath = Paths.get("menuItems.txt");
		File menuFile = filePath.toFile();
		System.out.println("Menu: 1-coffee, 2- muffin");
		System.out.println("What would you like to order. Please enter the menu item number:");
		userInput = scan1.nextInt();
		scan1.nextLine();
		
		System.out.println("You entered: "+userInput);
		switch (userInput) {
		case 1:
			// 1 = display list of countries
			//MyProduct.writeToFile(menuFile);
			//MyProduct.readFile(menuFile);
			break;
		case 2:
			// 2 = allows user to add to the list
			break;
		}
	}

}
