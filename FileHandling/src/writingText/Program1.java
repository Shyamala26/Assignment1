//Read Data from file1 and write that data into file2 (copy and paste)
package writingText;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Program1 {
public void readData() throws IOException {
		File readFile = new File("C:/Users/Chiranjeevi&Shyamala/Desktop/Program1/Assignment1_02May_file1.txt");
		FileReader fr = new FileReader(readFile);
		BufferedReader br = new BufferedReader(fr);

		File writeFile = new File("C:/Users/Chiranjeevi&Shyamala/Desktop/Program1/Assignment1_02May_file2.txt");
		FileWriter fw = new FileWriter(writeFile);
		BufferedWriter bw = new BufferedWriter(fw);

		System.out.println("+++ Lines in Text File 1 +++");
		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
			bw.write(line);
			bw.newLine();
		}

		br.close();
		bw.close();

		FileReader fr2 = new FileReader(writeFile);
		BufferedReader br2 = new BufferedReader(fr2);
		System.out.println("+++ Lines in Text File 2 +++");
		String line2;
		while ((line2 = br2.readLine()) != null) {
			System.out.println(line2);
		}
		br2.close();
		System.out.println("==>>Copied Succesfully!!Check your folder for TeXT file2");

	}

	public static void main(String[] args) throws IOException {
		System.out.println("** Ready to GO ***");
		Program1 h = new Program1();
		h.readData();

	}
}
