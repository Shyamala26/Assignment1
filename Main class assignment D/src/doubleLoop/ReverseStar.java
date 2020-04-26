////Program To print the starts into reverse upto 5 lines
package doubleLoop;

public class ReverseStar {

	public void method() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		ReverseStar r = new ReverseStar();
		System.out.println("*** Program To print the stars in reverse order upto 5 lines ***");
		r.method();
	}
}
