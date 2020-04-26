package doubleLoop;

public class Pyramid {

	public void method() {
		for (int i = 0, n = 4; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			for (int k = i; k > 0; k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		Pyramid p = new Pyramid();
		System.out.println("***PYRAMID Program***");
		p.method();
	}
}
