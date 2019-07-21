package algorithms.c1.s1;

public class P12 {

    public static String a() {
        StringBuilder sb = new StringBuilder();
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            sb.append(i);
        return sb.toString();
    }

}
