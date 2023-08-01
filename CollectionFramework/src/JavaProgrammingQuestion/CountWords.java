package JavaProgrammingQuestion;

public class CountWords {

	public static void main(String[] args) {
		
		String str[]="Abhishek Anil Charwad".split(" ");
		
		String revString="";
		
		for(int i=str.length-1;i>=0;i--)
		{
			revString=revString+str[i]+" ";
		}
		
		System.out.println(revString);
		
		//System.out.println("Words are Given String is "+str.length());

	}

}
