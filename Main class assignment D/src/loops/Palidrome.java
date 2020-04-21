// Program to write Palidrome or Not
package loops;

import java.util.Scanner;

public class Palidrome {

	public void check() {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the num:");
		int num = s.nextInt();
		s.close();
		// Logic
		
		int rem;
		int pal = 0;
		for (int tempNum = num; tempNum != 0; tempNum = tempNum / 10) {
			rem = tempNum % 10;
			pal = (pal * 10) + rem;
		}
		
		if (pal == num) {
			System.out.println("Entered Number is a palidrome number : " + num);
		} else {
			System.out.println("Entered Number is NOT a palidrome number : " + num);
		}
	}

	public static void main(String[] args) {
		Palidrome p = new Palidrome();
		p.check();
	}
}
