// File: company/employees/Developer.java
package company.employees;

public class Developer extends Employee  {
    String programmingLanguage;

    public Developer (String name, String id, int salary,String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {

        System.out.println("Employee name: " + name + "\nEmployee id: " + id + "\nEmployee salary: " + salary
                + "\nProgramming Language: " + programmingLanguage);
    }
}