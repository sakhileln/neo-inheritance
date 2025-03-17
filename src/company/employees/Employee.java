// File: company/employees/Employee.java
package company.employees;

public class Employee {
    public String Name;
    public int ID;
    public double salary;

    public Employee(String Name, int ID, double salary) {
        this.Name = Name;
        this.ID = ID;
        this.salary = salary;

    }

    public void displayInfo() {
        System.out.print("Name: " + Name + ", " + "ID: " + ID + ", " + "Salary: " + salary + ", ");

    }

}
