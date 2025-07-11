package OOPS.Strings;

import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String s = sc.nextLine();
		int n=s.length();
		if(n%2==0) {
			for(int i=0; i<s.length()/2;i++) {
				System.out.print(s.charAt(i));
		}
		}
		else if(n%2 !=0){
			System.out.println("null");
		}
	    sc.close();
	}

}
