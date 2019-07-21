package algorithms.c1.s1;

public class P15 {

    public static int[] histogram(int[] a, int m) {
        int[] histogram = new int[m];
        for (int i=0; i<a.length; i++) {
            histogram[a[i]]++;
        }
        return histogram;
    }

}
