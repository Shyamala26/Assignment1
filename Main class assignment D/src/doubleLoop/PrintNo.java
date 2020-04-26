//Print the Numbers line by line ## Pattern4
/* 1
   2 3
   4 5 6
   7 8 9 10*/

package doubleLoop;

public class PrintNo {

	public void method() {

		for (int i = 1, k = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++, k++) {
				System.out.print(k + " ");

			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		PrintNo p = new PrintNo();
		System.out.println(" ****  Pattern 4  ****");
		p.method();
	}

}
