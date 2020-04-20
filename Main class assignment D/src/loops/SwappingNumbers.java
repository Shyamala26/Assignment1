//Swapping of two number using third variable
package loops;

import java.util.Scanner;

public class SwappingNumbers {

	public void swapUsingTempVariable() {
		
		System.out.println("*****Swapping of two Numbers using 3rd Variable******");
		
		Scanner s = new Scanner(System.in);

		System.out.print("Enter the value a:");
		int a = s.nextInt();
		System.out.print("Enter the value b:");
		int b = s.nextInt();

		System.out.println("Values before swaping : \n a: " + a + "\n b: " + b);
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("Values after swaping : \n a: " + a + "\n b: " + b);
		
		s.close();

	}

	public static void main(String[] args) {		
		SwappingNumbers n = new SwappingNumbers();
		n.swapUsingTempVariable();		

	}

}
