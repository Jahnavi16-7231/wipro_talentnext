package java_fundamentals;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String gender=sc.nextLine();
		int age=sc.nextInt();
		if(gender.equals("female") && (age >= 1 && age <= 58)) {
			System.out.println("The percentage of interest is 8.2%.");
		}
		else if(gender.equals("female") && (age >=59&& age<=100)) {
			System.out.println("The percentage of interest is 9.2%.");
		}
		else if(gender.equals("male") && (age >=1&& age<=58)) {
			System.out.println("The percentage of interest is 8.4%.");
		}
		else if(gender.equals("male") && (age >=59&& age<=100)) {
			System.out.println("The percentage of interest is 10.5%.");
		}
		sc.close();
	}

}
