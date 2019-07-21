package algorithms.c1.s1;

public class P11 {

    public static String printBooleanArray(boolean[][] input) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<input.length; i++) {
            for (int j=0; j<input[i].length; j++) {
                sb.append(input[i][j] ? "*" : " ");
            }
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }

}
