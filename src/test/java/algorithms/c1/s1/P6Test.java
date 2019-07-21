package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P6Test {

    @Test
    void calculate() {
        String expected =
                "0\n" +
                "1\n" +
                "1\n" +
                "2\n" +
                "3\n" +
                "5\n" +
                "8\n" +
                "13\n" +
                "21\n" +
                "34\n" +
                "55\n" +
                "89\n" +
                "144\n" +
                "233\n" +
                "377\n" +
                "610\n";
        assertEquals(expected, P6.calculate());
    }
}