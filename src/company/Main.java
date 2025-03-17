// File: company/Main.java
package company;

// Import statements
import company.employees.Manager;
import company.employees.Developer;

public class Main {
    public static void main(String[] args){
        Manager newManager = new Manager("Moise", 202505, 40_000, 15_000);
        Developer newDeveloper = new Developer("Mark", 202508, 20_000, "Python");

        newManager.displayInfo();
        newDeveloper.displayInfo();
    }
}
