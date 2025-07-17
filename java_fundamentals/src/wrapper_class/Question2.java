package wrapper_class;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        Integer numObj = Integer.valueOf(number);

        String binary = Integer.toBinaryString(numObj);
        String octal = Integer.toOctalString(numObj);
        String hex = Integer.toHexString(numObj);

        System.out.println("Given Number : " + numObj);
        System.out.println("Binary equivalent : " + binary);
        System.out.println("Octal equivalent : " + octal);
        System.out.println("Hexadecimal equivalent : " + hex.toUpperCase());
        scanner .close();
	}
}


