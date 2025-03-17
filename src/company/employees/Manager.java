// File: company/employees/Manager.java
package company.employees;

public class Manager extends Employee {
    protected double bonus;

    public Manager (String name, String id, int salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayInfo () {

        System.out.println("Employee name: " + this.name + "\nEmployee id: " + this.id + "\nEmployee salary: " + this.salary +
                "\nManager bonus: " + this.bonus);
    }
}