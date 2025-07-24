package Abstraction_package_exceptionhandling;
import java.util.*;

class InvalidCountryException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InvalidCountryException(String message) {
		super(message);
	}
}

public class exceptionQ4 {

	static void registerUser(String username,String userCountry){
		try {
			if(!userCountry.equalsIgnoreCase("India")) {
				throw new InvalidCountryException("User Outside India  cannot be registered");
			}
			else {
				System.out.println("User registration done successfully");
			}
		}catch(InvalidCountryException e) {
			System.out.println(e.getMessage());
		}
	}
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter username:");
		String username = sc.nextLine();

		System.out.println("Enter country:");
		String country = sc.nextLine();
		registerUser(username,country);
		sc.close();
	}

}
