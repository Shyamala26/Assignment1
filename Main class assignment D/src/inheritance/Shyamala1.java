//Child Class
package inheritance;

public class Shyamala1 extends Shyamala
{
 public Shyamala1 ()
 {
	 this (1,2,3);
	 System.out.println("Child default constructor");
 }

 public Shyamala1 (int a)
 {
	 this ();
	 System.out.println("Child 1 parameterized constructor");
 }

 public Shyamala1 (int a,int b)
 {
	  this (1,2,3,4);
	 
	 System.out.println("Child 2 parameterized constructor");
	 
 }
 
 public Shyamala1 (int a,int b,int c)
 {
	super (2,3);
	 System.out.println("Child 3 parameterized constructor");
 }
 
 public Shyamala1 (int a,int b,int c,int d)
 {
	 this (1);
	 System.out.println("Child 4 parameterized constructor");
 }
 
 }
