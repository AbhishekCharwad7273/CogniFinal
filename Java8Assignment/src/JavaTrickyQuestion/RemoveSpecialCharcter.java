package JavaTrickyQuestion;

public class RemoveSpecialCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Pr!ogr#am%m*in&g Lan?#guag(e";
		String resultStr="";
		
		//str=str.replaceAll("[^a-zA-Z0-9]", "");
		
	//	System.out.println("String Without Special Charcter = "+str);
	
		//str=str.replaceAll("[a-zA-z0-9]", "");
		
	//	System.out.println("String with Special Charcter = "+str);
		
		
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>=65 && str.charAt(i)<=122)
			{
				resultStr=resultStr+str.charAt(i);
			}
		}
		System.out.println("String without Special Charcter = "+resultStr);
	}

}
