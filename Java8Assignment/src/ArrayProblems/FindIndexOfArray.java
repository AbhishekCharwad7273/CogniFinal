package ArrayProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindIndexOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {20,34,56,100,110};
		int value=34;
		
		int index=Arrays.binarySearch(arr, value);
		System.out.println((index < 0) ? -1 :index);
		
		/*for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==value)
			{
				System.out.println("position of value is "+i);
			}
			
		}
			*/
		
		List<Integer>arr1=Arrays.asList(10,20,30,40,50);
		
		Integer sum = arr1.stream().reduce(0,Integer::sum);
		System.out.println(sum);
		
		List<Integer> sumOfDigit = arr1.stream().map(x->x+sum).collect(Collectors.toList());
		System.out.println(sumOfDigit);
		
		
	}

}
