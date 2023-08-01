package JavaTrickyQuestion;

public class PrimeNumber {

	public static void main(String[] args) {

		int isPrime;
		for (int i = 1; i <= 100; i++) {
			isPrime = 0;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					isPrime = 1;
					break;
				}
			}

			if(isPrime==0)
			{
				System.out.println(i +" ");
			}
		}

	}

}
