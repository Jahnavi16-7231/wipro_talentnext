package Abstraction_package_exceptionhandling;
import java.util.*;

class InvalidAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3011141617916205986L;

	public InvalidAgeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
class InvalidArgumentException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2394771805964116170L;

	public InvalidArgumentException(String message) {
		super(message);
	}
}




public class exceptionQ5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		try {
			if(args.length<2) {
				throw new InvalidArgumentException("Enter only two arguments name and age of a person");
			}
			String name=args[0];
			int age=Integer.parseInt(args[1]);
			if(age<18 || age>=60) {
				throw new InvalidAgeException("Age must between 18 and 59");
			}
			
			
			System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Registration successful!");
		}catch(NumberFormatException e) {
			System.out.println(e);
			System.exit(0);
		}catch(InvalidAgeException | InvalidArgumentException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
		sc.close();
	}

}