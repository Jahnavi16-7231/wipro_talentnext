package java_fundamentals.Mini_project;
import java.util.*;
public class project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Enter employee ID: ");
	        int empid = sc.nextInt();
	        sc.close();

	        // Arrays for storing employee details
	        int[] empno = {1001, 1002, 1003, 1004, 1005};
	        String[] ename = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan"};
	        String[] dept = {"ECE", "IT", "Acct", "HR", "Finance"};
	        char[] desgCode = {'e', 'c', 'k', 'r', 'm'};
	        int[] basic = {20000, 23000, 15000, 27000, 30000};  
	        int[] hra = {8000, 9000, 10000, 12000, 15000};
	        int[] it = {3000, 4000, 3000, 4500, 5000};

	        boolean found = false;

	        for (int i = 0; i < empno.length; i++) {
	            if (empno[i] == empid) {
	                found = true;
	                int da = 0;
	                String desg = "";

	                switch (desgCode[i]) {
	                    case 'e':
	                        desg = "Engineer";
	                        da = 20000;
	                        break;
	                    case 'c':
	                        desg = "Consultant";
	                        da = 32000;
	                        break;
	                    case 'k':
	                        desg = "Clerk";
	                        da = 12000;
	                        break;
	                    case 'r':
	                        desg = "Receptionist";
	                        da = 15000;
	                        break;
	                    case 'm':
	                        desg = "Manager";
	                        da = 40000;
	                        break;
	                    default:
	                        desg = "Unknown";
	                        da = 0;
	                        break;
	                }

	                int salary = basic[i] + hra[i] + da - it[i];

	                System.out.println("\nEmp No.\tEmp Name\t\tDepartment\tDesignation\tSalary");
	                System.out.println(empno[i] + "\t" + ename[i] + "\t\t" + dept[i] + "\t\t" + desg + "\t\t" + salary);
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("There is no employee with empid: " + empid);
	        }
  }
}
