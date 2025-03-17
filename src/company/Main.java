// File: company/Main.java
package company;

// Import statements

import company.employees.Manager;
import company.employees.Developer;

public class Main {
    public static void main(String[] args){
        Manager Lonwabo = new Manager("Lonwabo","lozikhajhb024", 7000000, 0.75);
        Developer Lonwabo2 = new Developer ("Nwables", "lonwabozikhali", 1400000, "Python");
        Lonwabo.displayInfo();
        Lonwabo2.displayInfo();
    }
}
