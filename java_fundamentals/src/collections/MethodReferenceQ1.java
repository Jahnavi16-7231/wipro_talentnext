package collections;
@FunctionalInterface
interface FactorialFunction {
    int compute(int n);
}

class MyMath {
    // Instance method to compute factorial
    public int factorial(int n) {
        int result = 1;
        for(int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

public class MethodReferenceQ1 {
    public static void main(String[] args) {
        MyMath math = new MyMath(); // Create object

        // Refer instance method using functional interface and method reference
        FactorialFunction f = math::factorial;

        // Invoke the method
        int number = 5;
        int result = f.compute(number);

        System.out.println("Factorial of " + number + " is: " + result);
    }
}
