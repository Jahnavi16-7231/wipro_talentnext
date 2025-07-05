package java_fundamentals.Arrays;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int key=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++) {
			if(a[i]==key) { 
				System.out.println("Element found at index:"+i);
				found=true;
				break;
			}
		}		
		if(!found) {
		System.out.println("Element not found:-1");
		
	 }
		sc.close();	
	}	
}


