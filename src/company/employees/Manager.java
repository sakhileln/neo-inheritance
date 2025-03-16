// File: company/employees/Manager.java
package company.employees;

public class Manager extends Employee {
    double bonus;

    public Manager (String name, String id, int salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo () {

        System.out.println("Employee name: " + name + "\nEmployee id: " + id + "\nEmployee salary: " + salary +
                "\nManager bonus: " + bonus);
    }
}