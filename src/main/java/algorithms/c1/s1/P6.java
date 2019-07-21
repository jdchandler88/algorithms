package algorithms.c1.s1;

public class P6 {

    public static String calculate() {
        int f = 0;
        int g = 1;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i <= 15; i++) {
            sb.append(f).append(System.lineSeparator());
            f = f + g;
            g = f - g;
        }
        System.out.println(sb);
        return sb.toString();
    }



    // 0 - 0,1
    // f = 0 + 1 = 1
    // g = 1 - 1 = 0

    // 1 - 1,0
    // f = 1 + 0 = 1
    // g = 1 - 0 = 1

    // 2 - 1,1
    // f = 1 + 1 = 2
    // g = 2 - 1 = 1

    // 3 - 2,1
    // f = 2 + 1 = 3
    // g = 3 - 1 = 2

    // 4 - 3,2
    // f = 3 + 2 = 5
    // g = 5 - 2 = 3

    // 5 - 5,3
    // f = 5 + 3 = 8
    // g = 8 - 3 = 5

    //looks like fibbs!
}
