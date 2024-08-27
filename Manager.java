package Encapsulation_Inheritance;

public class Manager extends Member {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.name = "Shyam";
        m.age = 30;
        m.phone_no = 1234567890L;  // Use 'L' for long literal
        m.address = "MNR";
        m.salary = 60000.00;

        m.printSalary();
    }
}
