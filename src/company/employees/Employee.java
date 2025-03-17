// File: company/employees/Employee.java
package company.employees;

public class Employee {
    protected String name;
    protected String id;
    protected int salary;

    public Employee (String name, String id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo () {
        System.out.println("Employee name: " + this.name + "\nEmployee id: " + this.id + "\nEmployee salary: " + this.salary);
    }
}
