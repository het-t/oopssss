import java.util.Scanner;

public class checkCharacter {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a character");
        Character ch = Character.toLowerCase(scanner.next().charAt(0));
        
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("character is vowel");
        }
        else {
            System.out.println("character is consonant");
        }

        scanner.close();
    }
}
