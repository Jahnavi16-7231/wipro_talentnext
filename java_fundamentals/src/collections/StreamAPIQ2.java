package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    // Parameterized constructor
    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // To print employee details nicely
    @Override
    public String toString() {
        return empNo + " - " + name + " - " + age + " - " + location;
    }
}

public class StreamAPIQ2 {
    public static void main(String[] args) {
        // Step 1: Add 5 employees to list
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "Alice", 28, "Pune"));
        employees.add(new Employee(102, "Bob", 32, "Mumbai"));
        employees.add(new Employee(103, "Charlie", 25, "Pune"));
        employees.add(new Employee(104, "David", 30, "Delhi"));
        employees.add(new Employee(105, "Eve", 29, "Pune"));

        // Step 2: Filter employees with location "Pune"
        List<Employee> puneEmployees = employees.stream()
                .filter(e -> e.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());

        // Step 3: Print details of Pune employees
        System.out.println("Employees from Pune:");
        puneEmployees.forEach(System.out::println);
    }
}

