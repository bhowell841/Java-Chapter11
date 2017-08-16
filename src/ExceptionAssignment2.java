import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ExceptionAssignment2 {

	public static void main(String[] args) {
		int total = 0;
		double average;
		int counter = 0;
		
		
		Scanner input;
		
		try{
			input = new Scanner (new File("C:\\data.txt"));
			
			while(input.hasNext()){
				total += input.nextInt();
				counter++;
			}
			average = total/counter;
			
			PrintWriter outputFile = new PrintWriter("C:\\output.txt");
			outputFile.println(average);
			
			input.close();
			outputFile.close();
		}
		
		catch(FileNotFoundException fileNotFoundException){
			System.out.println("File was not found.");
			System.exit(1);
		}
		
		
	}  //  end main

}  //  end class
 