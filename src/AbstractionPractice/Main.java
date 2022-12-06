package AbstractionPractice;

public class Main {
    public static void main(String[] args) {
        Customer firstCustomer = new Customer("Nick", "Boiko", "12 Str", "41231321");
        Employee firstEmployee = new Employee("Tom", "Hank", "13 Str", 12);
        firstEmployee.display();
        firstCustomer.display();
    }
}
