package wrapper_class;

import java.util.Scanner;

public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter an integer (1 to 255): ");
	        int num = sc.nextInt();

	        if (num < 1 || num > 255) {
	            System.out.println("Invalid input. Please enter a number between 1 and 255.");
	            sc.close();
	            return;
	        }

	        String binary = Integer.toBinaryString(num);
	        String paddedBinary = String.format("%8s", binary).replace(' ', '0');

	        System.out.println(paddedBinary);
	        sc.close();

	}

}
