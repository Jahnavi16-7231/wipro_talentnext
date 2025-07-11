package OOPS.Strings;

import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		  String s1=sc.nextLine().toLowerCase();
		  String s2=sc.nextLine().toLowerCase();
		  if(s1.charAt(s1.length()-1)==s2.charAt(0)) {
			  s2=s2.substring(1);
		  }
		  System.out.println(s1.concat(s2));
		  sc.close();
	}

}
