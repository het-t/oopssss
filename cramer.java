import java.util.Arrays;

public class cramer {
    public static void main(String[] args) {

        Double[][] c = {{3.4, 2.1}, {50.2, 0.55}};

        Double d = c[0][0]*c[1][1] - c[0][1]*c[1][0];

        Double[][] b1 = {{44.5, 50.2}, {5.9, 0.55}};
        Double[][] b2 = {{3.4, 44.5}, {2.1, 5.9}};

        Double dB1 = b1[0][0]*b1[1][1] - b1[0][1]*b1[1][0];
        Double dB2 = b2[0][0]*b2[1][1] - b2[0][1]*b2[1][0];

        Double[] solution = {dB1 / d, dB2 / d};

        System.out.println("Solution: " + Arrays.toString(solution));
    }
}
