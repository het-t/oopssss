import java.util.Random;

public class randomInts {
    public static void main(String[] args) {
        Random rand = new Random(1000);
        for (int i = 0; i < 100; i++) {
            int randInt = rand.nextInt(49) + 1;
            System.out.print(randInt + " ");
        }
    }
}