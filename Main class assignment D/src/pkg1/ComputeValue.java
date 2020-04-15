//Project : ((((10+2)-2)+2)*2)/2)
package pkg1;

public class ComputeValue {
	
	public int division(int a, int b)
	{
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
		ComputeValue ob = new ComputeValue();

		int a = 10;
		int b = 2;

		int finalValue = ob.division(ob.mul(ob.sum(ob.subtraction(ob.sum(a, b), b), b), b), b);
		System.out.println("FinalValue:" + finalValue);

	}
}
