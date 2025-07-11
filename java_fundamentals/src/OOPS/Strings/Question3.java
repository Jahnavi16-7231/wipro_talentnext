package OOPS.Strings;

import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);  
	String s = sc.nextLine();  
	for(int i=0;i<s.length();i++) {
	String s2 = s.substring(0, 2); 
	System.out.print(s2); 
	}
	sc.close();                           
	}

}
