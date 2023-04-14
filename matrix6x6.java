import java.util.Random;

public class matrix6x6 {
    public static void main(String[] args) {
        int[][] matrix = generateMatrix();
        displayMatrix(matrix);
        checkCondition(matrix);
    }

    public static int[][] generateMatrix() {
        int[][] matrix = new int[6][6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = random.nextInt(2);
            }
        }
        return matrix;
    }
    
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void checkCondition(int[][] matrix) {
        for(int i = 0; i < 6; i++) {
            int counter = 0;
            
            for(int j = 0; j < 6; j++) {
                if (matrix[i][j] == 1) {
                    counter++;
                }
            }

            if (counter % 2 != 0) 
                System.out.println("row " + (i + 1) + " have odd number of 1's");
            else 
                System.out.println("row " + (i + 1) + " have even number of 1's");
                
        }

        for(int i = 0; i < 6; i++) {
            int counter = 0;
            
            for(int j = 0; j < 6; j++) {
                if (matrix[j][i] == 1) {
                    counter++;
                }
            }

            if (counter % 2 != 0) 
                System.out.println("column " + (i + 1) + " have odd number of 1's");
            else 
                System.out.println("column " + (i + 1) + " have even number of 1's");
                
        }
    }
}