import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Brendan Howell
 * CSC-151
 * 
 * Example of Exception handling
 */
public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double x;
		double y;
		double answer;

		// keep track of valid entries
		boolean invalidEntries = true;

		do{
			try{
				System.out.print("Enter the first number: ");
				x = input.nextDouble();

				System.out.print("Enter the second number: ");
				y = input.nextDouble();

				answer = x/y;

				System.out.printf(x + " divided by " + y + " equals %.2f", answer);
				invalidEntries = false;  // if data is valid 
			}  // end try
			
			catch(InputMismatchException inputError){
				System.out.println("You must enter a number");
				input.nextLine();  // clears the input
			}
			
			finally{  // optional- this will always execute
				
			}


		} while (invalidEntries);



	}  //  end main

}  //  end class
