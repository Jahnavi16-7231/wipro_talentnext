package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q3 {

	public static void printAll(List<String> al) {
		Iterator<String> iterator=al.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al=new ArrayList<>();
		al.add("mahesh babu");
		al.add("ntr");
		al.add("pk");
		al.add("ram");
		al.add("charan");
		printAll(al);
	}

}
