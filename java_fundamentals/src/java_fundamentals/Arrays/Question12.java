package java_fundamentals.Arrays;

import java.util.Scanner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] b=new int[n];
		for(int i=0;i<n;i++) {
			b[i]=sc.nextInt();
		}
		 System.out.println(a[1]+","+b[1]);	
		 sc.close();
		}

	}


