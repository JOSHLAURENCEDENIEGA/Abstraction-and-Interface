import java.util.Scanner;

interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
}

class Account implements BankAccount {
    double balance = 0;

    public void deposit(double amount) {
        balance += amount;
        System.out.printf("Deposited: %.2f, Balance: %.2f\n", amount, balance);
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.printf("Withdrew: %.2f, Balance: %.2f\n", amount, balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new Account();

        System.out.print("Enter deposit amount: ");
        acc.deposit(sc.nextDouble());

        System.out.print("Enter withdraw amount: ");
        acc.withdraw(sc.nextDouble());
    }
}
