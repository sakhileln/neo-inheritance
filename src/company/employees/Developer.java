// File: company/employees/Developer.java
package company.employees;

public class Developer extends Employee  {
    String programmingLanguage;

    public Developer (String name, String id, int salary,String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee id: " + id);
        System.out.println("Employee salary: " + salary);
        System.out.println("Programming Language: " + programmingLanguage);
    }
}
