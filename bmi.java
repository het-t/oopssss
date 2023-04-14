import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds");
        Double w = scanner.nextDouble();

        System.out.println("Enter height in inches");
        Double h = scanner.nextDouble();

        Double bmi = (w * 0.45359237) / Math.pow(h * 0.0254, 2);

        System.out.println("BMI is " + bmi);

        scanner.close();
    }   
}