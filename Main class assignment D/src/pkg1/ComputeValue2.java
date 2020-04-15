// Project 2 ((((10/2)-2)+2)-2)*2)

package pkg1;

public class ComputeValue2  //class declaration
{

	public int divison(int a, int b) //method 1
	{
		int div;
		div = a / b;
		return div;
	}

	public int subtraction(int a, int b) //method 2
	{
		int sub;
		sub = a - b;
		return sub;
	}

	public int sum(int a, int b) //method 3
	{
		int sum;
		sum = a + b;
		return sum;
	}

	public int multiplication(int a, int b)  //method 4
	{
		int mul;
		mul = a * b;
		return mul;
	}

	public static void main(String[] args) //main 
	{
		ComputeValue2 ob = new ComputeValue2(); //object creation
		int a = 10;
		int b = 2;
		/*
		 * int result =ob.divison(a,b) ob.subtraction(ob.divison(a,b),b)
		 * ob.sum(ob.subtraction(ob.divison(a,b),b),b) ob.subtraction
		 * (ob.sum(ob.subtraction(ob.divison(a,b),b),b),b) ob.multiplication
		 * (ob.subtraction (ob.sum(ob.subtraction(ob.divison(a,b),b),b),b),b)
		 */
		float finalresult = ob.multiplication(ob.subtraction(ob.sum(ob.subtraction(ob.divison(a, b), b), b), b), b);//calling the function
		System.out.println("FinalResult:" + finalresult);
	}
}