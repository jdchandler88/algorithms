package algorithms.c1.s1;

public class P5 {

    public static boolean isBetween0And1(double x, double y) {
        return isBetween0And1(x) && isBetween0And1(y);
    }

    public static boolean isBetween0And1(double x) {
        return x >= 0 && x <= 1;
    }

}
