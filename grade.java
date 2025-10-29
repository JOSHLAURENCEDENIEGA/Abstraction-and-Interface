import java.util.Scanner;

abstract class GradeCalculator {
    abstract double calculateAverage(double[] grades);
}

class StudentGrade extends GradeCalculator {
    double calculateAverage(double[] grades) {
        double sum = 0;
        for(double g : grades) sum += g;
        return sum / grades.length;
    }
}

public class StudentGradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[3];
        System.out.print("Enter 3 grades: ");
        for(int i = 0; i < 3; i++) grades[i] = sc.nextDouble();

        GradeCalculator gc = new StudentGrade();
        System.out.println("Average = " + gc.calculateAverage(grades));
    }
}
