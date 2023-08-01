package ArrayProblems;



public class ArrayReverseOrder {
/*
	static void rvereseArray(int arr[], int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}
*/
	public static void main(String[] args) {
/*
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		printArray(arr, arr[arr.length-1]);
		rvereseArray(arr, 0,5);
		System.out.print("Reversed array is \n");
		printArray(arr, 6);
		*/
		
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		System.out.println("orignal array is");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Array in reverse order");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
		}
		
	}

	

}

