
public class LcUc {

	public static void main(String[] args) {
		
		
		String str="abhiShekCharwad";
		int strLen=str.length()/2;
		String uc="";
		String lc="";
		
		
		for(int i=0;i<str.length();i++)
		{
			if(i<strLen)
			{
				lc=lc+Character.toLowerCase(str.charAt(i));
			}
			else
			{
				uc=uc+Character.toUpperCase(str.charAt(i));
			}
			
		}
		
		System.out.println(lc+uc);

	}

}
