
/**
   Filename: FileWriterExample.java
     Author: Shelley Lapkowski
       Date: Feb 28, 2023 6:39:38 p.m.
Description: This program takes input from the user and writes it to a file.
 */

import java.util.Scanner;
//import the input/output class
import java.io.*;

public class FileWriterExample
{

	public static void main(String[] args)
	{
		//create scanner to get info from keyboard
		Scanner myInput = new Scanner(System.in);
		//ask for input
		System.out.println("Please type a sentence and I will save it to a file!");
		String myText = myInput.nextLine();
		
		//set up a try catch block in case we cannot write to the file
		try
		{
			//create file using relative path
			//File outputFile = new File ("mySentence.txt");

			//create file using absolute path and create new subfolder "New"
			File outputFile = new File ("C:\\Work\\Courses\\2023WinterINFO6066CodingForTest\\New\\mySentence.txt");
			//make sure directory is there first before you try to write to file
			outputFile.getParentFile().mkdirs();
			
			//create PrinterWriter object
			PrintWriter writer = new PrintWriter(outputFile);
			//call writer method to save what we typed to file
			writer.write(myText);
			//close file, note: text does not get written to file until you close it!
			writer.close();
		}
		catch (FileNotFoundException ex)
		{
			System.out.println("There has been an exception thrown. Message: " + ex.getMessage());
		}
	}

}
