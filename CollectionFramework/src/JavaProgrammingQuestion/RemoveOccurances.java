package JavaProgrammingQuestion;

public class RemoveOccurances {

	public static void main(String[] args) {
		
		
		String str="cloudtech";
		
		//System.out.println(str.replaceAll("c",""));
				
		removeChar(str,'c');

	}
	
	public static void removeChar(String str,char c)
	{
		int n=str.length();
		
		String finalStr="";
		
		for(int i=0;i<n;i++)
		{
			if(str.charAt(i)!= c)
			{
				finalStr=finalStr+str.charAt(i);
			}
		}
		System.out.println(finalStr);
	}

}
