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
        System.out.println("name: " + name);
        System.out.println("ID: " + id);
        System.out.println("salary: " + salary);

    }
}
