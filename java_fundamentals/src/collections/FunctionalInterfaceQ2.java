package collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

public class FunctionalInterfaceQ2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 5, 15, 25, 35, 45));

        // Function to calculate sum
        Function<ArrayList<Integer>, Integer> sumFunction = list -> {
            int sum = 0;
            for (int n : list) {
                sum += n;
            }
            return sum;
        };

        int total = sumFunction.apply(numbers);
        System.out.println("Sum of numbers: " + total);
    }
}

