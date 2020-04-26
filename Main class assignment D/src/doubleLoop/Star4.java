//Program To print the starts upto 4 lines
package doubleLoop;

public class Star4 {

	public void method1()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
		}
			System.out.println();
	}
	}

	public static void main(String[] args) {
		Star4 m = new Star4();
		System.out.println( " **** Program to print the stars upto 4 lines ****");
		m.method1();
	}
}
