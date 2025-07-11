package OOPS.Strings;

import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		if(s.length() <=s1.length()) {
		System.out.println(s+s1+s);
		}
		else if(s.length() >=s1.length()) {
			System.out.println(s1+s+s1);
		}

		sc.close();
		
	}	
}
