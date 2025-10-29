import java.util.Scanner;

interface Payment {
    void processPayment(double amount);
}

class CreditCard implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class Gcash implements Payment {
    public void processPayment(double amount) {
        System.out.println("Paid " + amount + " using Gcash.");
    }
}

public class PaymentGateway {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose payment method (credit/gcash): ");
        String type = sc.next();
        System.out.print("Enter amount: ");
        double amt = sc.nextDouble();

        Payment p = type.equalsIgnoreCase("credit") ? new CreditCard() : new Gcash();
        p.processPayment(amt);
    }
}
