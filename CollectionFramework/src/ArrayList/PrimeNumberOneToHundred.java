package ArrayList;

public class PrimeNumberOneToHundred {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i, j, isPrime;
		System.out.println("Prime number 1 to 100");

		for (i = 2; i <= 100; i++) {
			isPrime = 0;

			for (j = 2; j <= i / 2; j++) {
				if (i % j == 0) {
					isPrime = 1;
					break;
				}
			}
			if (isPrime == 0) {
				System.out.print(i + " ");
			}
		}

	}

}