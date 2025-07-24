package collections;

import java.util.ArrayList;
import java.util.function.Function;

class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + location + " - " + salary;
    }
}

public class EmployeePredicateDemo {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Alice", "Pune", 50000));
        employees.add(new Employee(2, "Bob", "Mumbai", 55000));
        employees.add(new Employee(3, "Charlie", "Delhi", 60000));
        employees.add(new Employee(4, "David", "Pune", 52000));
        employees.add(new Employee(5, "Eva", "Bangalore", 58000));

        // Function to extract location
        Function<Employee, String> extractLocation = e -> e.location;

        // Create ArrayList to store locations
        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : employees) {
            locations.add(extractLocation.apply(e));
        }

        // Print locations
        System.out.println("Locations of Employees: " + locations);
    }
}
