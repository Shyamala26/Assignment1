// Parent Class

package inheritance;

public class Shyamala {
	
	public Shyamala()
	{
		this (1,2,3);
		System.out.println("Parent default constructor ");
		
	}
	public Shyamala( int a)
	{
		this ();
		System.out.println("Parent 1 parameterized constructor ");
	}
	public  Shyamala( int a,int b)
	{
		this (1);
		System.out.println("Parent 2 parameterized constructor ");
	}
	public Shyamala( int a,int b,int c)
	{
	 
		System.out.println("Parent 3 parameterized constructor ");
	}
      
}
