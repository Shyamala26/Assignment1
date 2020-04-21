// Program to write the Fibnocci series
package loops;

import java.util.Scanner;

public class FibnocciSeries {

	public void printFibnocciseries() {
		System.out.print("Enter the last positive number of the Fibnocci serie which you want to print : ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print("Here are the FibnocciSeries : " + a + " " + b);		
		while (c <= n) {
			c = a + b;
			a = b;
			b = c;
			if(c <= n) {
				System.out.print(" " + c);	
			}
		}
		
		s.close();
	}

	public static void main(String[] args) {
		FibnocciSeries f = new FibnocciSeries();
		f.printFibnocciseries();
	}

}
