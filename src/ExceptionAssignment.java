import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * 
 * Exception Assignment
 * This project prompts the user with a question for a survey which requires 
 * and integer entry.  It continues the loop until the user prompts it to
 * quit, all data is written to a file called "data.txt"
 * 
 */
public class ExceptionAssignment {
	// create file object
	private Formatter output;

	// procedure to create or open output file
	public void cafeteriaopenFile(){
		try{
			output = new Formatter("C:\\data.txt");  // creates a file
			System.out.println("File has been created.");
		}    
		
		catch(FileNotFoundException fileNotFoundException){
			System.out.println("File could not be created or opened.");
			System.exit(1);
		}
	} // end cafeteriaopenFile
	
	
	public void addData(){
		Scanner input = new Scanner(System.in);

		int rating;

		// Get user data
		System.out.println("On a scale of 1-5, rate your school cafeteria "
				+ "(5 being best: ");
		System.out.println("Press ctrl-z to quit.");


		while(input.hasNext()){
			rating = input.nextInt();
			try{
				output.format("%s\r\n", rating);
			}
			catch (FormatterClosedException formatterclosedexception){
				System.err.println("Error writing to file.");
			}
		}  // end while

	}  // end addData

	//  procedure to close the output file
	public void closeFile(){
		output.close();
	}  // end close file

} // end class
