//Swapping of two number without using third variable
package loops;
import java.util.Scanner;

public class Swapping {
	
	public void swapUsingWithoutTempVariable() {
			
			System.out.println("*****Swapping of two Numbers without using 3rd Variable******");
			
			Scanner s = new Scanner(System.in);

			System.out.print("Enter the value a:");
			int a = s.nextInt();
			System.out.print("Enter the value b:");
			int b = s.nextInt();

			System.out.println("Values before swaping : \n a: " + a + "\n b: " + b);
			
			a=a+b;
			b=a-b;
			a=a-b;
			
			System.out.println("Values after swaping : \n a: " + a + "\n b: " + b);
			s.close();

		}

		public static void main(String[] args) {		
			Swapping n = new Swapping();
			n.swapUsingWithoutTempVariable();

		}

	}

