//write a method and pass the inital_row_no and end_row_no and that method 
//will write the data between inital_row_no and end_row_no and you have to take
//the input data using scannerclass
package writingText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
	public void writeTextBetweenRange(int inital_row_no, int end_row_no) throws IOException {
		if (inital_row_no > 0 && end_row_no >= inital_row_no) {
			File f = new File("C:\\Users\\Chiranjeevi&Shyamala\\Desktop\\02May2020_Assignment3.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter b = new BufferedWriter(fw);
			String data;
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the Data which to be written in the text : ");

			for (int a = 1; a <= end_row_no; a++) {

				if (a >= inital_row_no) {
					data = s.nextLine();
					b.write(data);
				}

				b.newLine();
			}

			System.out.println("*** Success!! Please check the file. ***");
			b.close();
			s.close();
		} else {
			System.out.println("Incorrect Inputs! Start Line should " + "be greaterthan zero and End Line should be "
					+ "greaterthan or equal to Start Line.");
		}
	}

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Start line : ");
		int startLine = s.nextInt();
		System.out.print("Enter the End line : ");
		int endLine = s.nextInt();

		Program3 p = new Program3();
		p.writeTextBetweenRange(startLine, endLine);
		s.close();

	}

}
