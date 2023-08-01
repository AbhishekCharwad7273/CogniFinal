package JavaProgrammingQuestion;

public class MissingNoArray {

	public static void main(String[] args) {

		int arr[] = new int[] { 1, 5, 3, 4, 6, 7, 8, 9, 10 };

		int sum = (10 * 11) / 2;

		int actualsum = 0;

		for (int i = 0; i < arr.length; i++) {
			actualsum = actualsum + arr[i];
		}

		System.out.println("Missing no is " + (sum - actualsum));
	}

}
