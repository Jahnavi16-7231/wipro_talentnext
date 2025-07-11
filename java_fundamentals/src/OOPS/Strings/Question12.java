package OOPS.Strings;

import java.util.StringJoiner;

public class Question12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringJoiner a=new StringJoiner("-");
		a.add("Hyderabad");
		a.add("Banglore");
		StringJoiner b=new StringJoiner("-");
		b.add("Mumbai");
		b.add("chennai");
		StringJoiner merge1=new StringJoiner("-");
		merge1.merge(b);
		merge1.merge(a);
		System.out.println("a merged to b: " + merge1);

		StringJoiner merge2=new StringJoiner("-");
		merge2.merge(a);
		merge2.merge(b);
		System.out.println("b merged to a: " + merge2);
		
	}

}
