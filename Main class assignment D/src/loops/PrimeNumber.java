// Number is Prime or NOT  -- done
package loops;

import java.util.Scanner;

public class PrimeNumber {

	public void primeNumber() {
		System.out.println("*** Program whether Number is Prime or Not *** ");
		Scanner s = new Scanner(System.in);
		System.out.println(("Enter the value of n:"));
		int n = s.nextInt();
		s.close();

		// Logic
		boolean isPrime = true;

		if (n <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i < n / 2; i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}
		}

		if (isPrime) {
			System.out.println("Number is prime :" + n);
		} else {
			System.out.println("Number is NOT prime :" + n);
		}
	}

	// main
	public static void main(String[] args) {

		PrimeNumber p = new PrimeNumber();
		p.primeNumber();
	}
}
