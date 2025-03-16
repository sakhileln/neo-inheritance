package company.employees;

public class intern extends Employee{
    String university;
    public intern(String name, int id, double salary, String university){
        super(name,id, salary);
        this.university = university;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("university: " + university);
    }
}
