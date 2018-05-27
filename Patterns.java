package may27;

import java.util.Scanner;

public class Patterns {
	
	/*static void printPattern2(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= n-i; j++) {
				System.out.print(1);
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	static void printPattern1(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
*/	
	static void printPattern3(int n) {
		for(int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	

	public static void main(String args[]) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		printPattern3(n);
	}
}
