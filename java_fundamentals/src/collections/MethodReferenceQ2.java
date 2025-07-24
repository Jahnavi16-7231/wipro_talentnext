package collections;

@FunctionalInterface
interface DigitCounter {
    int count(int n);
}

class NumberUtil {
    // Static method to count digits
    public static int digitCount(int n) {
        if (n == 0) return 1;
        return (int) Math.log10(Math.abs(n)) + 1;
    }
}

public class MethodReferenceQ2 {
    public static void main(String[] args) {
        // Refer static method using functional interface and method reference
        DigitCounter dc = NumberUtil::digitCount;

        // Test value
        int number = 123456;
        int digits = dc.count(number);

        System.out.println("Number of digits in " + number + " is: " + digits);
    }
}

