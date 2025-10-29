import java.util.Scanner;

interface Vehicle {
    void start();
    void speedUp(int increment);
}

class Car implements Vehicle {
    int speed = 0;

    public void start() {
        System.out.println("Car started.");
    }

    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Car speed: " + speed + " km/h");
    }
}

public class VehicleSpeedControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehicle car = new Car();
        car.start();
        System.out.print("Enter speed increment: ");
        int inc = sc.nextInt();
        car.speedUp(inc);
    }
}
