//Project : ((((x1+x2)-x3)+x4)*x5)/x6)
package pkg1;

import java.util.Scanner;

public class CalucatorScanner {

	public int division(int a, int b) {
		int div;
		div = a / b;
		return div;

	}

	public int subtraction(int a, int b) {
		int sub;
		sub = a - b;
		return sub;
	}

	public int sum(int a, int b) {
		int addition;
		addition = a + b;
		return addition;
	}

	public int mul(int a, int b) {
		int multiplication;
		multiplication = a * b;
		return multiplication;
	}

	public static void main(String[] args)

	{

		Scanner c = new Scanner(System.in);

		System.out.println("enter the value of x1:");
		int x1 = c.nextInt();
		System.out.println("enter the value of x2:");
		int x2 = c.nextInt();
		System.out.println("enter the value of x3:");
		int x3 = c.nextInt();
		System.out.println("enter the value of x4:");
		int x4 = c.nextInt();
		System.out.println("enter the value of x5:");
		int x5 = c.nextInt();
		System.out.println("enter the value of x6:");
		int x6 = c.nextInt();

		CalucatorScanner ob = new CalucatorScanner();

		int finalValue = ob.division(ob.mul(ob.sum(ob.subtraction(ob.sum(x1, x2), x3), x4), x5), x6);
		System.out.println("FinalValue:" + finalValue);
c.close();
	}
}

