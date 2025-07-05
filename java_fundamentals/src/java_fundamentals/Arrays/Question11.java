package java_fundamentals.Arrays;

import java.util.Scanner;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		boolean isvalid=true;
		for(int i=0;i<n;i++) {
		if(a[i] !=1 && a[i] !=4) {
				isvalid=false;
				break;
		}
		}
		if(isvalid) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
       sc.close();
	}
}
