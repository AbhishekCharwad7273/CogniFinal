package ArrayProblems;

import java.util.Arrays;

public class MinimumMaximumNoInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,234,43,15,7845,32,75,222,678};
		
		Arrays.sort(a);
		
		System.out.println("Minimum no is = "+a[0]);
		System.out.println("Maximum No is = "+a[a.length-1]);
	}

}
