import java.util.*;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();
        employeeList.add(new Employee(1, "John", "Manager", 50000));
        employeeList.add(new Employee(2, "Alice", "Developer", 60000));
        employeeList.add(new Employee(3, "Bob", "Designer", 55000));
        employeeList.add(new Employee(4, "Carol", "Engineer", 65000));

        // Sort by name
        Collections.sort(employeeList, Comparator.comparing(Employee::getName));

        System.out.println("Sorted by name:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }

        // Sort by salary
        Collections.sort(employeeList, Comparator.comparing(Employee::getSalary));

        System.out.println("\nSorted by salary:");
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}

