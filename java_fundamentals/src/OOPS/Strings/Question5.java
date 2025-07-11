package OOPS.Strings;

import java.util.Scanner;

public class Question5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String s = sc.nextLine();
		
		if (s.length() <= 2) {
            System.out.println(""); 
        } 
		System.out.println(s.substring(1,s.length()-1));
		sc.close();
	}

}
