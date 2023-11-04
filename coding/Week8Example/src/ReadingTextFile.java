/**
 *  Filename: ReadingTextFile.java
	Professor: Shelley Lapkowski
	Date: Oct 24, 2023, 11:12:17 AM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */
import java.io.*;
import java.util.Scanner;
public class ReadingTextFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String line ="";
		System.out.println("This will read and display the content of the file");
		
		try {
			File fileOne = new File("C:\\Users\\OPend\\OneDrive\\Desktop\\sst\\Practical\\output.txt");
			
			
			Scanner fileReader = new Scanner(fileOne);
			
			
			while(fileReader.hasNextLine())
			{
				line = fileReader.nextLine();
				System.out.println(line);
			}
			fileReader.close();
			
		}catch(Exception ex)
		{
			System.out.println("An exception has been thrown ! Message is:\n");
		}
		

	}

}
