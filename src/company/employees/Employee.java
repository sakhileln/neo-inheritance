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

    public void displayInfo () {
        System.out.println("Employee name: " + name + "\nEmployee id: " + id + "\nEmployee salary: " + salary);
    }
}
