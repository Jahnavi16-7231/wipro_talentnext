package java_fundamentals.Arrays;

import java.util.*;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int[] res=new int[n];
		int index=0;
		for(int i=0;i<n;i++) {
		if(a[i] != 10) {
			res[index++]=a[i];
		}
       }
		System.out.println(Arrays.toString(res));
		sc.close();
    }
}
