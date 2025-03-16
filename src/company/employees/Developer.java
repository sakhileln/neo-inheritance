// File: company/employees/Developer.java
package company.employees;

public class Developer extends  Employee{
    String programmingLanguage;
    public Developer(String name, int id, double salary, String programmingLanguage){
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("programmingLanguage: " + programmingLanguage);

    }
}
