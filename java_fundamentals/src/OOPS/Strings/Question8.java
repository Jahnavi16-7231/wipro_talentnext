package OOPS.Strings;

import java.util.Scanner;

public class Question8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String s = sc.nextLine();
		StringBuilder a=new StringBuilder();
		for(int i=0;i<s.length();i++) {
			if((i > 0 && s.charAt(i - 1) == '*') || 
	                (s.charAt(i) == '*') || 
	                (i < s.length() - 1 && s.charAt(i + 1) == '*')) {
	                continue;
	            }
			a.append(s.charAt(i));
		}
	
	System.out.println(a);
	sc.close();
}
}

