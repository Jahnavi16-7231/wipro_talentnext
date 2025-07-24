package collections;
import java.util.ArrayList;
public class LambdaQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<>();

        // Adding 10 different words
        al.add("apple");
        al.add("banana");
        al.add("cat");
        al.add("dog");
        al.add("elephant");
        al.add("fish");
        al.add("grape");
        al.add("hat");
        al.add("igloo");
        al.add("jungle");

        // Printing strings with odd length using lambda expression
        al.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);
	}

}
