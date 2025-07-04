package java_fundamentals;

import java.util.Arrays;
import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
        
		char[] a=s.toCharArray();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			if (i == a.length - 1) {
                System.out.print(a[i]); 
            } else {
                System.out.print(a[i] + ","); 
            }
		}
		sc.close();

	}

}
