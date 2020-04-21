//A number is Armstrong or not
package loops;

import java.util.Scanner;

public class Armstrong {
	public void armstrong() {
        Scanner s = new Scanner(System.in);
		System.out.print("Enter the num:");
		int n = s.nextInt();
			
		// Logic
		int sum = 0;
		for (int temp = n, digit = 0; temp > 0; temp = temp / 10) {
			digit = temp % 10;
			sum = sum + (digit * digit * digit);
		}
		if (sum == n) {
			System.out.println("Entered Number is Armstrong : " +n);
		} else {
			System.out.println("Entered Number is NOT Armstrong : "+n);
		}
		s.close();
	}

	public static void main(String[] args) {
		Armstrong a = new Armstrong();
		a.armstrong();
	}
}
