// Program To print the table  -- done
package loops;

import java.util.Scanner;

public class TablePrint {

	public void tablePrint() {
		System.out.println("*****Program To print Table*****");
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value a:");
		int a = s.nextInt();

		// Logic
		for (int i = 0; i <= 20; i++) {
			System.out.println(a + " " + "*" + " " + i + " " + "=" + " " + a * i);
		}
		s.close();
	}

	public static void main(String[] args) {
		TablePrint t = new TablePrint();
		t.tablePrint();
	}

}
