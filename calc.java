import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter expression");
        String expression = scanner.nextLine();

        scanner.close();

        expression = expression.replaceAll("\\s", "");

        String[] tokens = expression.split("");

        Integer n1 = Integer.parseInt(tokens[0]);
        Integer n2 = Integer.parseInt(tokens[2]);

        Character operand = tokens[1].charAt(0);

        if (operand == '+') {
            System.out.println(n1 + n2);
        }
        else if (operand == '-') {
            System.out.println(n1 - n2);
        }
        else if (operand == '*') {
            System.out.println(n1 * n2);
        }
        else if (operand == '/') {
            System.out.println(n1 / n2);
        }
        else {
            System.out.println("invalid expression");
        }
    }   
}