import java.util.Scanner;

public class meterToFeet {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length in meter:");
        double meter = scanner.nextDouble();

        double feet = meter * 3.28084;

        System.out.println("length in feet: " + feet);

        scanner.close();
    }
}