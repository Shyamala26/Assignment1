//Print the Numbers using DoubleLoop
package doubleLoop;

public class PrintNumbers {
	
	public void method()
	{
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<=i;j++)
			{
			System.out.print(j+1);
		}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		PrintNumbers p = new PrintNumbers();
		System.out.println("*** Print the Numbers using DoubleLoop ***");
		p.method();
	}

}
