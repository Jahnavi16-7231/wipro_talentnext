package OOPS.Strings;
import java.util.*;
public class Question1 {
	public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
  /* String s=sc.nextLine();
   String a="";
   
   for(int i=s.length()-1;i>=0;i--) {
	   a=a+s.charAt(i);
   }
   System.out.println(a);
   if(s.equals(a)) {
   System.out.println("palindrome");
   }
   else {
	   System.out.println("not palindrome");
   }*/
   
    String s=sc.nextLine();
    StringBuilder a = new StringBuilder(s);
    a.reverse();
  
   if(s.equals(a.toString())) {
   System.out.println("palindrome");
   }
   else {
	   System.out.println("not palindrome");
   }
   sc.close();
 }
}
