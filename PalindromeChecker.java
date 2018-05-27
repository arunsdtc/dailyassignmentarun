package may27;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String value = sc.next();
		//madam
		int i,j;
		for( i = 0,j = value.length()-1; i<j; i++,j--) {
			if(value.charAt(i) == value.charAt(j)) {
				continue;
			}else {
				break;
			}
		}
		if ((j-i) > 2  || (j-i) < -2) {
			System.out.println("not a palondrome");
		}else {
			System.out.println("palindrome");
		}
		
	}
}
