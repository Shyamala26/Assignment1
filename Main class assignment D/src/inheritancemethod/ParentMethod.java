// Parent Class in Method 
package inheritancemethod;

public class ParentMethod {
	
public void method1()
{
	this.method4();
 System.out.println("Parent default method");
}

     public void method2 ()
    {
     this.method1();
    	 System.out.println("Parent 1 parmaeterized method");
  }

     public void method3 ()
     {
    	 this.method2();
      System.out.println("Parent 2 parmaeterized method");
     }
     public void method4 ()
     {
      System.out.println("Parent 3 parmaeterized method");
     }

}
