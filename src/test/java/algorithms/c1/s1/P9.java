package algorithms.c1.s1;

public class P9 {

    public static String toBinaryString(int in) {

        //ints are 32 bits wide
        //start with 1, which will mask all but the lsb
        int mask = 1;

        //string builder to capture results
        StringBuilder sb = new StringBuilder();

        //sweep mask over 32 bits of input number
        for (int i=0; i<=31; i++) {
            //if the result is 0, then the revealed bit is off. otherwise, it is a 1
            int result = in & mask;
            sb.insert(0, result==0 ? "0" : "1");
            //shift mask left by one for next result
            mask = mask << 1;
        }
        // java's tobinarystring cuts off leading 0s
        String normalizeToIntegerToBinaryString = sb.toString().replaceFirst("^0+", "");
        // the logic above creates an empty string if the input number is 0. correct for this case
        if (normalizeToIntegerToBinaryString.isBlank()) normalizeToIntegerToBinaryString = "0";
        return normalizeToIntegerToBinaryString;

    }

}
