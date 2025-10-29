import java.util.Scanner;

interface Printable {
    void print(String content);
}

class TextPrinter implements Printable {
    public void print(String content) {
        System.out.println("Printing text: " + content);
    }
}

class ImagePrinter implements Printable {
    public void print(String content) {
        System.out.println("Printing image: " + content);
    }
}

public class PrinterInterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose printer (text/image): ");
        String type = sc.next();
        System.out.print("Enter content: ");
        String content = sc.next();

        Printable p = type.equalsIgnoreCase("text") ? new TextPrinter() : new ImagePrinter();
        p.print(content);
    }
}
