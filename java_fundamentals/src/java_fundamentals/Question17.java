package java_fundamentals;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0) {
        	int ld=n%10 ;
        	sum += ld;
        	n=n/10;
        }
        System.out.print(sum);
        sc.close();
	}
}
