package JavaTrickyQuestion;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = "i like this program very much".split(" ");
		String ans = "";
		for (int i = s.length - 1; i >= 0; i--) {
			ans=ans + s[i] + " ";
		}

		System.out.println(ans.substring(0, ans.length() - 1));
		
		
		String str="abhishek";
		String reStr="";
		
		for(int j=str.length()-1;j>=0;j--)
		{
			reStr=reStr+str.charAt(j);
			
		}
		
		System.out.println(reStr);

	}

}
