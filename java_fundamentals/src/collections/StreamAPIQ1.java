package collections;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIQ1 {
    public static void main(String[] args) {
        // Original ArrayList with mixed numbers
        List<Integer> numbers = Arrays.asList(10, -2, -3, -4, 5, -6, 7, -9, 0, 8);

        // Filter negative even numbers and store in new list
        List<Integer> negativeEven = numbers.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        // Print the new list
        System.out.println("Negative even numbers: " + negativeEven);
    }
}
