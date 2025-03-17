// File: company/employees/Employee.java
package company.employees;

public class Employee {
    String name;
    int id;
    double salary;

    public Employee(String name, int id, double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary);
    }
}
