// File: company/employees/Developer.java
package company.employees;

public class Developer extends Employee  {
    protected String programmingLanguage;

    public Developer (String name, String id, int salary,String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayInfo() {

        System.out.println("Employee name: " + this.name + "\nEmployee id: " + this.id + "\nEmployee salary: " + this.salary
                + "\nProgramming Language: " + this.programmingLanguage);
    }
}