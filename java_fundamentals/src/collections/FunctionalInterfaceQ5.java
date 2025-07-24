package collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class FunctionalInterfaceQ5 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) numbers.add(i * i); // Adds 0 to 81 (squares)

        Predicate<Integer> isPerfectSquare = n -> {
            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        };

        System.out.println("Perfect square numbers:");
        for (int n : numbers) {
            if (isPerfectSquare.test(n)) {
                System.out.print(n + " ");
            }
        }
    }
}
