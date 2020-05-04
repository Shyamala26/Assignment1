//write  a method and pass the row_count and that method will write the data
//till that row_count and u have to take input data using scanner class, the data
//will go inside the file
package writingText;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program2 {
	public void writeToText(int rowCount2) throws IOException {
File f = new File("C:\\Users\\Chiranjeevi&Shyamala\\Desktop\\02May2020_Assignment2.txt");
FileWriter fw = new FileWriter(f);
		BufferedWriter b = new BufferedWriter(fw);
		String data;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Data which to be written in the text : ");
		for (int i = 1; i <= rowCount2; i++) {
			data = s.nextLine();
			b.write(data);
			b.newLine();
		}
		System.out.print("*** Success!! Please check the file. ***");
		b.close();
		s.close();

	}

	public static void main(String[] args) throws IOException {
		System.out.println("*** Program 2 *** ");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Row Count : ");
		int rowCount1 = s.nextInt();
		Program2 p = new Program2();
		p.writeToText(rowCount1);
		s.close();

	}

}
