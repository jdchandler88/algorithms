package algorithms.c1.s1;

public class P14 {

    public static int lg(int N) {
        int i = 0;
        int powi = 0;   //2^0 = 1;
        while (powi <= N) {
            i++;
            powi = power(2, i);
        }
        return --i;
    }

    private static int power(int input, int power) {
        if (power==0) return 1;
        int result = 1;
        for (int i=0; i<power; i++) {
            result *= input;
        }
        return result;
    }

}
