//Reading and writing the text
package writingText;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingText {
	
	public void shyamala() throws IOException
	{
		File f = new File("C:\\Users\\Chiranjeevi&Shyamala\\Desktop\\ShyamalaData.txt");
		FileWriter fw = new FileWriter(f);
		fw.write("I am the Student");
		fw.close();
	}
	
	public static void main (String[] args) throws IOException
	{
		WritingText w=new WritingText();
		w.shyamala();
	}

}
