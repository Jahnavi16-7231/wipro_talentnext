package collections;
import java.util.*;
public class setQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> emp=new HashSet<>();
		emp.add("Mahesh Babu");
		emp.add("NTR");
		emp.add("Balayya");
		emp.add("bhAAi");
		emp.add("Ram charan");
		Iterator<String> i=emp.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
	}

	}
}
