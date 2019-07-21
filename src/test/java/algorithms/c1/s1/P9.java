package algorithms.c1.s1;

public class P9 {

    public static String toBinaryString(int in) {

        //ints are 32 bits wide
        //start with 1, which will mask all but the lsb

        int mask = 1;

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<=31; i++) {
            int result = in & mask;
            sb.insert(0, result==0 ? "0" : "1");
            mask = mask << 1;   //shift mask bit left by one
        }

        return sb.toString();

    }

}
