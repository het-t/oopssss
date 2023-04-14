import java.util.Arrays;
import java.util.Scanner;

public class sort {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double[] num = new Double[3];

        System.out.println("enter three numbers: ");
        num[0] = scanner.nextDouble();
        num[1] = scanner.nextDouble();
        num[2] = scanner.nextDouble();

        for(int i = 0; i < num.length; i++) {
            for(int j = 0; j < num.length; j++) {
                if (num[i] > num[j]) {
                    Double temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(num));

        scanner.close();
    }
}
