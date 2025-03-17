// File: company/employees/Developer.java
package company.employees;

public class Developer extends Employee {
    String Programminglanguage;

    public Developer(String Name, int ID, double salary, String Programminglanguage) {
        super(Name, ID, salary);
        this.Programminglanguage = Programminglanguage;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.print("Programminglanguage: " + Programminglanguage);
    }
}
