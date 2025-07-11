package OOPS.Strings;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String a = sc.nextLine();
		String b = sc.nextLine();
		StringBuilder c=new StringBuilder();
		int i=0;
		while(i<a.length()||i<b.length()) {
			if(i<a.length()) {
				c.append(a.charAt(i));
			}
			if(i<b.length()) {
				c.append(b.charAt(i));
			}
			i++;
		}
		System.out.println(c.toString());
		sc.close();
	}

}
