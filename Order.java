import java.util.Scanner;

interface Order {
    void placeOrder();
}

class OnlineOrder implements Order {
    String item;
    OnlineOrder(String item) { this.item = item; }
    public void placeOrder() {
        System.out.println("Online order placed for: " + item);
    }
}

class PhoneOrder implements Order {
    String item;
    PhoneOrder(String item) { this.item = item; }
    public void placeOrder() {
        System.out.println("Phone order placed for: " + item);
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Order type (online/phone): ");
        String type = sc.next();
        System.out.print("Enter item name: ");
        String item = sc.next();

        Order o = type.equalsIgnoreCase("online") ? new OnlineOrder(item) : new PhoneOrder(item);
        o.placeOrder();
    }
}
