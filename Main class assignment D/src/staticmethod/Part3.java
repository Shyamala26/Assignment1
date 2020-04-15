//Call the non static method from static method(within same class)
package staticmethod;

public class Part3 {

	public void method1() {
		System.out.println("!!Shyamala!! - I am Non-static method1() in Part3 class!!");
	}

	public static void method2() {
		System.out.println("!!Shyamala!! - I am static method2() in Part3 class!!");
		Part3 p = new Part3();
		p.method1();

	}

	public static void main(String[] args) {
		System.out.println("***Call the non static method from static method within same class***");
        Part3.method2();
	}

}
