package JavaTrickyQuestion;

import java.util.Scanner;

public class NoPositiveNegetive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no;

		System.out.println("enter the no");
		Scanner sc = new Scanner(System.in);

		no = sc.nextInt();
		sc.close();
		if (no < 0) {
			System.out.println("No is Negetive");
		}

		else if (no > 0) {
			System.out.println("No is positive");

		}

		else {
			System.out.println("nos is not positive nor Negetive");
		}

	}

}
