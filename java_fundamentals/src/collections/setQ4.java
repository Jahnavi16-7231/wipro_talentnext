package collections;
import java.util.*;
public class setQ4 {
	private TreeSet<String> ts;
	public setQ4() {
		ts=new TreeSet<>();
	}
	public TreeSet<String> saveCountryName(String countryName) {
		ts.add(countryName);
		return ts;
		
	}
	public String getCountry(String countryName) {
		Iterator<String> i=ts.iterator();
		while(i.hasNext()) {
			String s=i.next();
			if(s.equalsIgnoreCase(countryName)){
				return s;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setQ4 obj=new setQ4();
		System.out.println(obj.saveCountryName("India"));
		System.out.println(obj.saveCountryName("USA"));
		System.out.println(obj.saveCountryName("Japan"));
		System.out.println(obj.getCountry("usa"));
		System.out.println(obj.getCountry("china"));
}
}
