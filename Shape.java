import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter shape (circle/rectangle): ");
        String type = sc.next();

        if (type.equalsIgnoreCase("circle")) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            Shape c = new Circle(r);
            System.out.println("Area = " + c.calculateArea());
        } else {
            System.out.print("Enter length: ");
            double l = sc.nextDouble();
            System.out.print("Enter width: ");
            double w = sc.nextDouble();
            Shape r = new Rectangle(l, w);
            System.out.println("Area = " + r.calculateArea());
        }
    }
}
