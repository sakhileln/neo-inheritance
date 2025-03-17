// File: company/employees/Manager.java
package company.employees;

public class Manager extends Employee {
    double bonus;
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Bonus: " + bonus);
    }
}
