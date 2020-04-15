// Using This Keyword -->Method 

package pkg1;

public class ThisMethod 
{
    

	public void ThisMethod()
	{
		
		System.out.println(" Dafault method");
	}
	
	public void ThisMethod1()
	{
		
		System.out.println(" one Parameterized method");
	}

	public void ThisMethod2 ()
	{
		
		System.out.println(" two Parameterized method");
	}

	public  void ThisMethod3() 
	{
		System.out.println(" three Parameterized method");
	}
	
	public void  ThisMethod4()
	{
		System.out.println(" four parameterized method");
		this.ThisMethod();
		this.ThisMethod1();
		this.ThisMethod3();
		this.ThisMethod2();
	}

	public static void main(String[] args)

	{
		System.out.println("## This keyword in method Program ##");
		ThisMethod ob =new ThisMethod();
		ob.ThisMethod4();
		System.out.println("completed!!");
	}

}
