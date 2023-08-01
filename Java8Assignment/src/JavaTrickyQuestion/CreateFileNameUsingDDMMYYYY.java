package JavaTrickyQuestion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CreateFileNameUsingDDMMYYYY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String out=new SimpleDateFormat("yyyy-MM-dd hh-mm-ss '.tsv' ").format(new Date());
		System.out.println(out);

	}

}
