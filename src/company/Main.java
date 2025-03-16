// File: company/Main.java
package company;

// Import statements

import company.employees.Developer;
import company.employees.Manager;

public class Main {
    static Manager boss = new Manager("karabo", 408, 65000.0, 12000.50);
    static Developer worker = new Developer("skara", 101, 50000.0, "java");

    public static void main(String[] args){
        boss.displayInfo();
        worker.displayInfo();
    }
}
