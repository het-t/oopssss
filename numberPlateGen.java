import java.util.Random;

public class numberPlateGen {
    
    public static void main(String[] args) {
        char[] alphanum = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        Random random = new Random();

        String genPlate = new String();

        for(int i = 0; i != 3; i++) {
            Integer j = random.nextInt(0, 26);
            genPlate = genPlate + alphanum[j];
        }

        for(int i = 0; i != 4; i++) {
            Integer j = random.nextInt(26, 36);
            genPlate = genPlate + alphanum[j];
        }

        System.out.println(genPlate);
    }
}