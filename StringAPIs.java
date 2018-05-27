package may27;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAPIs {
	
	public static void main(String args[]) {
		/*String a,b;
		a = "Sagar";
		b = a.toUpperCase();
		System.out.println(b);
		System.out.println(a);
		*/
		
		
		
		/*String empty = new String();
		System.out.println(empty);
		char charArrray[] = new char[5];
		charArrray[0] = 'S';
		charArrray[1] = 'a';
		charArrray[2] = 'g';
		charArrray[3] = 'a';
		charArrray[4] = 'r';
		System.out.println(charArrray);
		String name = new String(charArrray);
		System.out.println(name);
		String arun = new String("ARUN");
		System.out.println(arun);*/
		
		char charArrray[] = new char[5];
		charArrray[0] = 'S';
		charArrray[1] = 'a';
		charArrray[2] = 'g';
		charArrray[3] = 'a';
		charArrray[4] = 'r';
		System.out.println(charArrray);
		String sagar = String.copyValueOf(charArrray);
		System.out.println(sagar);
		
		String mybool = String.valueOf(true);
		System.out.println(mybool);
		
		Pattern matcher = Pattern.compile("hello");
	}

}
