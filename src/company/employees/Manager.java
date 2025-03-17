// File: company/employees/Manager.java
package company.employees;

public class Manager extends Employee {
    double bonus;

    public Manager(String Name, int ID, double salary,double bonus) {
        super(Name, ID, salary);
        this.bonus = bonus;

    }

    @Override
    public void displayInfo() {
        System.out.println("Name : " + Name + ", " + "ID : " + ID +", " + "Salary : " + salary + ", " + " Bonus : " + bonus);
    }
}
