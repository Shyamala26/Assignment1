// Program of a Factorial number  -- done
package loops;

import java.util.Scanner;

public class FactorialOfNumber {

	public void factorial() {
		System.out.println(" ****Factorial of the Number**** ");
		System.out.println(" Enter the Value of a :");

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int b = 1;
		System.out.println(" **Factorial Series**");
		for (int i = b; i <= n; i++) {

			System.out.println(i);
		}

		for (int i = n; i > 0; i--) {
        b = b * i;
		}
		System.out.println("Factorial Number is : " + b);
		s.close();
	}

	public static void main(String[] args) {
		FactorialOfNumber f = new FactorialOfNumber();
		f.factorial();
	}

}
