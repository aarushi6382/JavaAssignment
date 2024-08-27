package Encapsulation_Inheritance;

public class Employee extends Member {
    public static void main(String[] args) {
        Employee e = new Employee();

        e.name = "Ram";
        e.age = 30;
        e.phone_no = 1234567890L;  
        e.address = "KTM";
        e.salary = 50000.00;

        e.printSalary();
    }
}
