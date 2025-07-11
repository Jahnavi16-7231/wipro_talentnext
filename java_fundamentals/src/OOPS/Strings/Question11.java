package OOPS.Strings;
import java.util.ArrayList;
import java.util.StringJoiner;
public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
              ArrayList<String> n=new ArrayList<>();
       n.add("CSE");
       n.add("DS");
       n.add("CS");
       
       StringJoiner sj=new StringJoiner(",","{","}");
       for (String name : n) {
           sj.add(name);
       }
       System.out.println(sj.toString());
	}

}
