package java_fundamentals.Arrays;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		 if (n < 2) {
	            System.out.println("element not found:-1");
	            sc.close();
	            return;
	        }
		int max1=a[0];
		int max2=-1;
		int min1=a[0];
		int min2=-1;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2 && a[i] !=max1){
				max2=a[i];
			}if(a[i]<min1) {
				min2=min1;
				min1=a[i];
			}
			else if(a[i]<min2 && a[i] !=min1){
				min2=a[i];
			}	
		}
	    System.out.println("largest:"+max1);
	    System.out.println("second largest:"+max2);
	    System.out.println("smallest:"+min1);
	    System.out.println("second smallest:"+min2);
	    sc.close();
	}
}
