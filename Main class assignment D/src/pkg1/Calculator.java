package pkg1;

public class Calculator {
	public int div(int a,int b)
	{
		int division;
		division=a/b;
		return division;
	}
	public int sub (int d, int e)
	{
		int subtraction;
		subtraction=d-e;
		return subtraction;
	}
	public int sum(int g , int h)
	{
		int addition;
		addition=g+h;
		return addition;
	}
public int mul (int j, int k)
{
	int multiplication;
	multiplication=j*k;
	return multiplication;
}
	
	public static void main(String[] args)
	
	{
		Calculator ob=new Calculator();
		
		int div_result =ob.div(10, 2);
		System.out.println("division: " + div_result);
		
		int sub_result =ob.sub(10,2);
		System.out.println("subtraction "+ sub_result);
		
		int sum_result =ob.sum(10,2);
		System.out.println("sum "+sum_result);
		
		int mul_result =ob.mul(10,2);
		System.out.println("multiplication "+ mul_result);
	}
}


	

