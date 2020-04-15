//Call the non static method from static method(in different class)
package staticmethod;

public class Part4 {

	public static void method1() {

		System.out.println("!!Shyamala!! - I am Non-static method1() in Part4 class!!");
		Part3 p = new Part3();
		p.method1();
	}

	public static void main(String[] args) {
		System.out.println("*** Call the non static method from static method(in different class)***");
		Part4.method1();

	}

}
