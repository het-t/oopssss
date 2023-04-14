import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class factor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer");
        int num = scanner.nextInt();

        ArrayList<Integer> factors = new ArrayList<Integer>(); 

        int i = 2;
        while(num > 1) {
            if (num % i == 0) {
                num = num / i;
                factors.add(i);   
            }
            else {
                i = i +1;
            }
        }

        System.out.println(factors);

        scanner.close();
    }   
}