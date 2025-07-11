package OOPS.Strings;

import java.util.Scanner;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);  
		String a = sc.nextLine();
		int n=sc.nextInt();
		String s=a.substring(a.length()-n);
		StringBuilder res=new StringBuilder();
		for(int i=0;i<n;i++) {
			res.append(s.charAt(i));
		}
		System.out.println(res);
		sc.close();
	}

}
