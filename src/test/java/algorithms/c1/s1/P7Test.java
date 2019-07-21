package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P7Test {

    @Test
    void a() {
        assertEquals("3.00009\n", P7.a());
    }

    @Test
    void b() {
        assertEquals("499500", P7.b());
    }

    @Test
    void c() {
        int N = 11;
        String expected = Integer.toString(10*N);
        assertEquals(expected, P7.c(N));
    }
}