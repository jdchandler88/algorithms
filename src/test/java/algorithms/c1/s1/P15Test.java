package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P15Test {

    @Test
    public void histogram() {
        int a[] = new int[]{1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 5};
        int m = 6;
        int[] expected = new int[6];
        for (int i=0; i<6; i++) {
            expected[i] = i;
        }
        assertArrayEquals(expected, P15.histogram(a, m));
    }

}