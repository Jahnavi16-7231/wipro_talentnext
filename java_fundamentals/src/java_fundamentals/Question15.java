package java_fundamentals;

import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc= new Scanner(System.in);
	        int n =sc.nextInt();
	        if(n<=1){
	         System.out.println(n+"is not a prime number");
	        }
	         else{
	         boolean isPrime=true;
	         for(int i=2;i<n;i++){
	         if(n%i==0){
	         isPrime=false;
	         break;
	         }
	         }
	         if(isPrime){
	         System.out.println(n+"is a prime number");
	         }
	         else{
	         System.out.println(n+"is not a prime number");}
	         }
	        sc.close();
	}

}
/*
 * Scanner sc= new Scanner(System.in);
	        int n =sc.nextInt();
	        int count=0;
	        for(int i=1;i<=n;i++){
	        if(n%i=0){
	        count++;

	        }
	        }
	        if(count==2){
	         System.out.println(n+"is a prime number");
	         }
	         else{
	         System.out.println(n+"is not a prime number");
	         }  
	         sc.close();
	         }     
*/