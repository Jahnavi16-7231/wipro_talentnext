package wrapper_class;

class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Override clone method
    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported");
            return null;
        }
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class EmployeeCloneTest {
    public static void main(String[] args) {
        // Original employee
        Employee emp1 = new Employee(101, "Alice", 50000);
        
        // Clone employee
        Employee emp2 = emp1.clone();

        // Modify original employee
        emp1.name = "Bob";
        emp1.salary = 60000;

        // Output both
        System.out.println("Original Employee:");
        emp1.display();

        System.out.println("Cloned Employee:");
        emp2.display();
    }
}

