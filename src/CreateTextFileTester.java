/*
 * Brendan Howell
 * CSC-151
 * 
 * Test out createtextfile app
 */
public class CreateTextFileTester {

	public static void main(String[] args) {
		//  create instance of testfile
		CreateTextFile ctf = new CreateTextFile();
		
		ctf.createopenFile();
		ctf.addRecords();
		ctf.closeFile();

	}  // end main

}  // end class
