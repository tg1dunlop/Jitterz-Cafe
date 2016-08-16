package jitterzcafe;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class mainJitterz {

	public static void main(String[] args) {

Scanner scan1 = new Scanner(System.in);
int userInput = 0;
System.out.println("Welcome to Jitterz-Cafe!");

Path filePath = Paths.get("menuItems.txt");
File menuFile = filePath.toFile();

//displaying the menu from MyProduct
MyProduct.writeToFile(menuFile);
MyProduct.readFile(menuFile);

System.out.println("What would you like to order?  Please enter the menu item number: ");
userInput = scan1.nextInt();
scan1.nextLine();
System.out.println("You entered: " + userInput);



		
		System.out.println("You entered: "+userInput);
		switch (userInput) {
		case 1:
			
			
			break;
		case 2:
			// 2 = allows user to add to the list
			break;
		}

	}

}
