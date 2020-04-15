package pkg1;

public class Constructor 
{
    

	public Constructor()
	{
		this(10,20,30,40);
		System.out.println(" Dafault Parameterized");
	}
	
	public Constructor(int a)
	{
		this(a, 20);
		System.out.println(" one Parameterized constructor");
	}

	public Constructor(int a, int b)
	{
		this();
		System.out.println(" two Parameterized constructor");
	}

	public Constructor(int a, int b, int c) 
	{
		this(a);
		System.out.println(" three Parameterized constructor");
	}
	
	public Constructor (int a, int b, int c, int d)
	{
		System.out.println(" four parameterized constructor");
	}

	public static void main(String[] args)

	{
		System.out.println("## Constructor Program ##");
		new Constructor(1,2,3);
		System.out.println("completed!!");
	}

}
