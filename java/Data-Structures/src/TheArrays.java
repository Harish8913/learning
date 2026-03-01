import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        char[][] array = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = '-';
            }
        }

        System.out.println(Arrays.deepToString(array));
    }
}
