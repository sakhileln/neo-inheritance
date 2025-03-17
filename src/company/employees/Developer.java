// File: company/employees/Developer.java
package company.employees;

public class Developer extends Employee{
    String programmingLanguage;

    public Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: " + salary + ", Programming Language: " + programmingLanguage);
    }
}
