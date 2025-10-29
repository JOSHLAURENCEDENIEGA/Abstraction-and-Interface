import java.util.Scanner;

abstract class Employee {
    String name;
    double rate;
    double hours;

    Employee(String name, double rate, double hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    abstract double calculatePay();
}

class FullTimeEmployee extends Employee {
    FullTimeEmployee(String name, double rate, double hours) {
        super(name, rate, hours);
    }

    double calculatePay() {
        return rate * hours;
    }
}

class PartTimeEmployee extends Employee {
    PartTimeEmployee(String name, double rate, double hours) {
        super(name, rate, hours);
    }

    double calculatePay() {
        return rate * hours;
    }
}

public class EmployeePaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee type (full/part): ");
        String type = sc.next();
        sc.nextLine();
        System.out.print("Enter name, rate per hour, and hours: ");
        String name = sc.next();
        double rate = sc.nextDouble();
        double hours = sc.nextDouble();

        Employee emp;
        if (type.equalsIgnoreCase("full"))
            emp = new FullTimeEmployee(name, rate, hours);
        else
            emp = new PartTimeEmployee(name, rate, hours);

        System.out.println("Pay: " + emp.calculatePay());
    }
}
