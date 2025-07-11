package OOPS.Strings;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String s = sc.nextLine();
		if(s.startsWith("x")) {
			s=s.substring(1);
		}
		if(s.endsWith("x")) {
			s=s.substring(0,s.length()-1);
		}
		System.out.println(s);
		sc.close();
	}
	

}
