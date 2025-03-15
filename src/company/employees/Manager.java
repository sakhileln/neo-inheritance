// File: company/employees/Manager.java
package company.employees;

public class Manager extends Employee {
    double bonus;

    public Manager (String name, String id, int salary,double bonus) {
        this.bonus = bonus;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo () {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
        System.out.println("Manager bonus: " + bonus);
    }
}