import java.util.Scanner;

interface Appliance {
    void turnOn();
    void turnOff();
}

class Fan implements Appliance {
    public void turnOn() { System.out.println("Fan is now ON."); }
    public void turnOff() { System.out.println("Fan is now OFF."); }
}

class Light implements Appliance {
    public void turnOn() { System.out.println("Light is now ON."); }
    public void turnOff() { System.out.println("Light is now OFF."); }
}

public class ApplianceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose appliance (fan/light): ");
        String type = sc.next();

        Appliance app = type.equalsIgnoreCase("fan") ? new Fan() : new Light();
        app.turnOn();
        app.turnOff();
    }
}
