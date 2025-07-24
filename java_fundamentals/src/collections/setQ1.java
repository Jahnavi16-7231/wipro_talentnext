package collections;
import java.util.*;

public class setQ1 {

private HashSet<String> h1;
	
	public setQ1() {
		h1 = new HashSet<>();
	}

	public HashSet<String> saveCountryName(String countryName) {
		h1.add(countryName);
		return h1;
		
	}
	public String getCountry(String countryName) {
		Iterator<String> i=h1.iterator();
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
	    setQ1 obj=new setQ1();
		System.out.println(obj.saveCountryName("India"));
		System.out.println(obj.saveCountryName("usa"));
		System.out.println(obj.getCountry("usa"));
		System.out.println(obj.getCountry("china"));
	}

}
