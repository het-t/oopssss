import java.util.Scanner;

public class gcd {
    public static int gcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int ans = gcd(n1, n2);

        System.out.println(ans);

        scanner.close();
    }
}