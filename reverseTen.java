import java.util.Scanner;

public class reverseTen {
    public static void main(String[] args) {
        String[] nums = new String[10];

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter 10 numbers");
        for(int i = 0; i<nums.length; i++) {
            nums[i] = String.valueOf(scanner.nextInt());
        }

        scanner.close();
    
        System.out.println("reversing");
        for(int i = 0; i != nums.length; i++) {
            StringBuilder numStr = new StringBuilder(nums[i]).reverse();
            System.out.println(numStr);
        }
    }
}