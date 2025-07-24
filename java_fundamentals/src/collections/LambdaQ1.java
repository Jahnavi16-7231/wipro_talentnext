package collections;
import java.util.ArrayList;
import java.util.Random;

public class LambdaQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Integer> al = new ArrayList<>();
	        Random rand = new Random();

	        // Add 25 random numbers between 1 and 100
	        for (int i = 0; i < 25; i++) {
	            al.add(rand.nextInt(100) + 1);
	        }

	        System.out.println("All numbers: " + al);
	        System.out.print("Prime numbers: ");

	        // Lambda expression to print only prime numbers
	        al.stream().filter(n -> isPrime(n)).forEach(n -> System.out.print(n + " "));
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        if (num <= 1)
	            return false;
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0)
	                return false;
	        }
	        return true;
	}

}
