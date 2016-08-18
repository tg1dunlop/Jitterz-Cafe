package jitterzcafe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class MyProduct {
	
	public static void readFile(File menuFile) {
		try {
			FileReader reader = new FileReader(menuFile); // reads chars from the text file
			
			BufferedReader bReader = new BufferedReader(reader); //BR handed object of FR 
			
			String newLine = bReader.readLine(); //method to read lines of text instead of single characters 
			
			while(newLine != null)		{
				System.out.println(newLine);
				
				newLine = bReader.readLine(); 
							//Just saying read each line of text and stop when null value is reached
			}	
			
		} 
		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		catch (IOException e ) //Throws whenever input/ output exception occurs, ie. if our file was no longer available
		{
			
		}
	}

	public static void writeToFile(File menuFile) { // Method to create initial list
		PrintWriter wrt = null; // create wrt object from the print writer class
		try {
			wrt = new PrintWriter(menuFile);
			wrt.println("Menu Items");
			wrt.println("============");
			wrt.println("1: COFFEE:\n ~Iced Coffee - $3.50\n ~Decaf - $2.50\n ~Regular - $2.00\n\n2: LATTES\n ~Regular - $3.50\n ~Flavored - $2.50\n ~Decaf Mocha - $2.00\n\n3: PASTRIES\n ~Beignets - $3.50\n ~Scones - $2.50\n ~Muffins - $1.00\n\n4: BUZZERS - /shot (Pre-noon Prices)\n ~Baileys - $4.50\n ~Kahlua - $5.50\n ~Whiskey - $9.00");
						
		} catch (FileNotFoundException e) {
			//System.out.println("Please enter a number to order!");
			e.printStackTrace();
			
		}
		finally
		{
			wrt.close();
		}
	}
	
	public static void writeToFileAppend(File menuFile) {
		Scanner scan1 = new Scanner(System.in);
		FileWriter wrt = null;
		try {
			
			wrt = new FileWriter(menuFile,true);
			
			System.out.println("Enter your choice :");
			
			String input = scan1.nextLine();
			System.out.println();
			wrt.append(input);
			wrt.append('\n');
			wrt.close();
			
		} catch (FileNotFoundException e) {
			
			
			e.printStackTrace();
			System.out.println("Please enter a number to order!");
		}
		catch(IOException e)
		{
			System.out.println("Please enter a number to order!");
			
		}
		
	}
	
}


