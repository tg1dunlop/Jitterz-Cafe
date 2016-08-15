package jitterzcafe;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyProduct {

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

}
