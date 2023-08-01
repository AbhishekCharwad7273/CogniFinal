package ArrayProblems;

import java.util.HashMap;

public class StringComparision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="abhi";
		String str2="abhi";
		
		System.out.println("using equals Method "+str1.equals(str2));
		System.out.println("using == Method"+str1==str2);
		
		HashMap<Object, Integer>hmap=new HashMap<>();
		hmap.put(str2, 12);
		System.out.println(hmap);
		
		HashMap<Object, Object>hmap2=new HashMap<>();
		hmap2.put(str1, str2);
		System.out.println(hmap2);
	}

}
