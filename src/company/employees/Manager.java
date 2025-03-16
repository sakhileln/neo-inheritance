// File: company/employees/Manager.java
package company.employees;

public class Manager extends Employee{
    double bonus;
    public Manager(String name, int id, double salary, double bonus) {
        super(name, id, salary);
        this.bonus = bonus;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("bonus: " + bonus);
    }
}
