// Child Class in Method 
package inheritancemethod;

public class ChildMethod extends ParentMethod 
{

public void method5()
{
	 this.method9();
	System.out.println("Child default method");
}
public void method6()
{
	 this.method5();
	System.out.println("Child 1 parameterized method");
}
public void method7( )
{
 this.method6();
	System.out.println("Child 2 parameterized method");
}

public void method8( )
{
	System.out.println("Child 3 parameterized method");
}
public void method9( )
{
	super.method3();
	System.out.println("Child 4 parameterized method");
}
}
