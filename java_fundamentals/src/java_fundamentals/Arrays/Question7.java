package java_fundamentals.Arrays;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc =new Scanner(System.in);
      int n=sc.nextInt();
      Set<Integer> a=new HashSet<>();
      for(int i=0;i<n;i++) {
    	  a.add(sc.nextInt());
      }
      for(int num:a) {
      System.out.print(num+" ");
	  }
      sc.close();
	}

}
