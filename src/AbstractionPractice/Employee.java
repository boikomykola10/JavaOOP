package AbstractionPractice;

public class Employee extends Person{

    private double salary;

    public Employee(String firstName, String lastName, String address, double salary) {
        super(firstName, lastName, address);
        this.salary = salary;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
    }
}
