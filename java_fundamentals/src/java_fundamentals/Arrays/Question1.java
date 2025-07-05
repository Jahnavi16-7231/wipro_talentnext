package java_fundamentals.Arrays;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<=a.length-1;i++) {
			sum=sum+a[i];
		}
		double average=(double)(sum)/a.length-1;
		System.out.println("sum:"+sum);
		System.out.println("average:"+average);
		sc.close();
	}

}
