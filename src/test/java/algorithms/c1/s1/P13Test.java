package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P13Test {

    @Test
    void transpose() {
        Object[][] input = new Object[][] {
                new Object[]{1, 2, 3, 4},
                new Object[]{5, 6, 7, 8},
                new Object[]{9, 10, 11, 12}
        };

        Object[][] expected = new Object[][] {
            new Object[]{1, 5, 9},
            new Object[]{2, 6, 10},
            new Object[]{3, 7, 11},
            new Object[]{4, 8, 12}
        };

        P13.transpose(input, 3, 4);
        assertArrayEquals(expected, P13.transpose(input, 3, 4));

    }
}