package java_fundamentals;
import java.util.*;
public class question4b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int a=sc.nextInt();
	        int b=sc.nextInt();
	        if(a<0 & b<0) {
	        	System.out.println("false");
	        }
	        else if(a%10 == b%10) {
	        	System.out.println("true");
	        }
	        else {
	        	System.out.println("false");
	        }
	        sc.close();
	}

}
