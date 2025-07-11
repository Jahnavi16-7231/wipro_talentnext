package OOPS;

public class MainQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeQ5 emp = new EmployeeQ5("Alice", 65000.50, 2020, "AB12345XY");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());
        System.out.println("Start Year: " + emp.getStartYear());
        System.out.println("Insurance No: " + emp.getNationalInsuranceNumber());
	}

}
