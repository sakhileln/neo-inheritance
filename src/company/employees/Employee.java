// File: company/employees/Employee.java
package company.employees;

public class Employee {
    String name;
    String id;
    int salary;

    public Employee (String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public Employee () {
    }

    public void displayInfo () {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
    }
}
