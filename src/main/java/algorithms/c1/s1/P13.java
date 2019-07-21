package algorithms.c1.s1;

public class P13 {

    public static Object[][] transpose(Object[][] input, int rows, int cols) {

        Object[][] transposed = new Object[cols][rows];

        for (int i=0; i<rows; i++) {
            for (int j=0; j<cols; j++) {
                transposed[j][i] = input[i][j];
            }
        }

        return transposed;

    }

}
