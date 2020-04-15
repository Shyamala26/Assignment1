// Call the static method from another static method within same class
package staticmethod;

public class Part1 {

	static int number = 200; // variable declared

	public static void method1() {
		System.out.println(" !!Shyamala!! - I am static method1() in Part1 class!!");
	}

	public static void main(String[] args) {
		System.out.println("*** Call the static method from another static method within same class ***");

		Part1.method1();
		
		System.out.println("Static variable : " + Part1.number);
	}
}
