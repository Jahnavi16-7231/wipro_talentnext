package collections;
import java.util.*;
public class setQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<>();
		ts.add("Sunday");
		ts.add("Monday");
		ts.add("Tuesday");
		ts.add("Wednesday");
		ts.add("Friday");
		NavigableSet<String> r = ts.descendingSet();
		System.out.println(r);
		Iterator<String> i=ts.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		String check="Friday";
		if(ts.contains(check)) {
			System.out.println("exist");
		}else {
			System.out.println("not exist");
		}
	}

}
