package program1;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCharacter {
	
	public void method() throws IOException 
{
		File f = new File("C:\\Users\\Chiranjeevi&Shyamala\\Desktop\\shyamalafilehandling.txt"); //connection established
		FileReader fr = new FileReader(f);
		int a;
		while ((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
		fr.close();
		

	}
	
	public static void main(String[] args) throws IOException 
	{
	ReadCharacter r = new ReadCharacter();
	r.method();
	}

}
