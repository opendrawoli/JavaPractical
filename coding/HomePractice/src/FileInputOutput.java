/**
 *  Filename: FileInputOutput.java
	Professor: Shelley Lapkowski
	Date: Oct 22, 2023, 4:32:16 PM
	Student Name: Opendra Oli
	Student Id : 1170811
	Description:
 */
import java.io.*;
public class FileInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		try (BufferedReader br = new BufferedReader(new FileReader(
				"C:\\Users\\OPend\\OneDrive\\Desktop\\sst\\Practical\\output.txt"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        System.out.println(line);
		    }
		} catch (IOException e) {
		    e.printStackTrace();
		}
		 
	}

}
