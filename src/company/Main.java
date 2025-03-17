// File: company/Main.java
package company;

// Import statements

import company.employees.Developer;
import company.employees.Manager;

public class Main {
    public static void main(String[] args) {

        Manager no1 = new Manager("mbali",98,100,30);
        no1.displayInfo();

        Developer person = new Developer("lerato",22,300,"python");
        person.displayInfo();
    }

}
