package OOPS;
import java.util.*;
public class calculatorQ2 {
	public static int  powerInt(int num1,int num2) {
		return (int) Math.pow(num1, num2);
	}
	public static double powerDouble(double num1,double num2) {
		return (double) Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        int result1 =calculatorQ2  .powerInt(num1,num2);
        System.out.println("Result of powerInt: " + result1);
        
        System.out.println("Enter the num1:");
        double doublenum1=sc.nextDouble();
        System.out.println("Enter the num2:");
        double doublenum2=sc.nextDouble();
        double result2 =calculatorQ2.powerDouble(doublenum1,doublenum2);
        System.out.println("Result of powerInt: " + result2);
        sc.close();     
	}

}
