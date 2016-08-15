package jitterzcafe;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyProduct {
	
	public static void readFile(File menuFile) {
		try {
			FileReader reader = new FileReader(menuFile);
			
			BufferedReader bReader = new BufferedReader(reader);
			
			String newLine = bReader.readLine();
			
			while(newLine != null)
			{
				System.out.println(newLine);
				
				newLine = bReader.readLine(); 
				
			}	
			
		} 
		catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
		catch (IOException e )
		{
			
		}
	}

	public static void writeToFile(File menuFile) { // Method to create initial list
		PrintWriter wrt=null;
		try {
			wrt= new PrintWriter(menuFile);
			wrt.println("Coffee\nLattes\nBeignets\nBuzzers");
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		finally
		{
			wrt.close();
		}
	}
	
	public static void writeToFileAppend(File menuFile) {
		Scanner scan1 = new Scanner(System.in);
		FileWriter wrt=null;
		try {
			
			wrt= new FileWriter(menuFile,true);
			
			System.out.println("Enter your choice :");
			
			String input = scan1.nextLine();
			System.out.println();
			wrt.append(input);
			wrt.append('\n');
			wrt.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		catch(IOException e)
		{
			
		}
		
	}
	
}


