package pkg1;

public class Class1 {  //boundary of the class
	int a; // declare the variable
	public void shyamala()  //()indicate this as a method
	{                       // method name 'shyamala'
		System.out.println("welcome Chiru");
	}
	public static void main(String[] args) {
		Class1 ob =new Class1(); //object created
		ob.shyamala(); //called the method
		ob.a=23;
		System.out.println(ob.a);
		ob.a=35;
		System.out.println(ob.a);
	}
}
