package doubleLoop;

public class StarReverse {

	public void method() {
		
		for (int i = 0,n=4; i <= n; i++) 
		{
			for (int j = 1; j <= n-i; j++) 
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++)
			{
				System.out.print("*");
			}

			System.out.println("");
		}

	}

	public static void main(String[] args) {
		StarReverse sr = new StarReverse();
		System.out.println("***Pattern 5 ***");
		sr.method();
	}

}
