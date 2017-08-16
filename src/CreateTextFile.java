import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * 
 * Three procedures to create text file,
 * add records, and close text file
 * 
 */
public class CreateTextFile {

	// create file object
	private Formatter output;

	// procedure to create or open output file
	public void createopenFile(){
		try{
			output = new Formatter("D:\\Eclipse\\Chapter11\\Chapter11\\client.txt");  // creates a file
			System.out.println("File has been created.");

		}
		catch(FileNotFoundException fileNotFoundException){
			System.out.println("File could not be created or opened.");
			System.exit(1);
		}
	} // end createopenFile

	//  procedure to add records/data to our output file
	public void addRecords(){
		String rec;
		Scanner input = new Scanner(System.in);
		// ask user for data 
		System.out.println("Enter client name and money owed: ");
		System.out.println("Press ctrl-z to quit.");

		while( input.hasNext()){
			rec = input.nextLine();
			try{
				output.format("%s\r\n", rec);  // %s - print
			}
			catch (FormatterClosedException formatterclosedexception){
				System.err.println("Error writing to file.");
			}
		} // end while
	}  // end addRecords

	//  procedure to close the output file
	public void closeFile(){
		output.close();
	}  // end close file

}  //  end class
