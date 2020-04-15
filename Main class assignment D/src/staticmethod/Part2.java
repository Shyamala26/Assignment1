// Call the static method from another static method(in different class)
package staticmethod;

public class Part2 {

	public static void method1() {
		System.out.println(" !!Shyamala!! - I am static method1() in Part2 class!!");
		Part1.method1();
	}

	public static void main(String[] args) {
		System.out.println("*** Call the static method from another static method(in different class) ***");

		Part2.method1();
		
	}
}
