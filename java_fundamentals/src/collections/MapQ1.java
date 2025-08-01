package collections;
import java.util.*;
public class MapQ1 {
	private HashMap<String,String> m1;
	public MapQ1() {
		m1=new HashMap<>();
	}
	public HashMap<String,String> saveCountryCapital(String countryName,String capital){
		m1.put(countryName, capital);
		return m1;
	}
	public String getCapital(String countryName) {
		if(m1.containsKey(countryName)) {
			return m1.get(countryName);
		}else {
			return "not present";
		}
	}
	public String getCountry(String capitalName) {
		for(String s:m1.keySet()) {
			if(capitalName.equalsIgnoreCase(m1.get(s))) {
				return s;
			}
		}
		return null;
	}
	public HashMap<String,String> exchange(){
		HashMap<String,String> m2=new HashMap<>();
		for(String s:m1.keySet()) {
			m2.put(m1.get(s), s);
		}
		return m2;
	}
	public ArrayList<String> getcountries(){
		ArrayList<String> al=new ArrayList<>();
		for(String s:m1.keySet()) {
			al.add(s);
		}
		return al;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapQ1 obj=new MapQ1();
		System.out.println(obj.saveCountryCapital("India","Delhi"));
		System.out.println(obj.saveCountryCapital("Japan","Tokoyo"));
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokoyo"));
		System.out.println(obj.exchange());
		System.out.println(obj.getcountries());

	}

}
