package java_fundamentals;

import java.util.Scanner;

public class Question20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0) {
        	int rem=n%10;
        	sum =sum*10+rem;
        	n/=10;
        }
        if(sum==temp) {
        	System.out.println(temp+" is  a palindrom.");
        }
        else {
        	System.out.println(temp+" is not a palindrom.");
        }
        sc.close();
	}

}
