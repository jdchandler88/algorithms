package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P8Test {

    @Test
    void a() {
        assertEquals('b', P8.a());
    }

    @Test
    void b() {
        // 'b' = 98, 'c' = 99; 98+99 = 197
        // the result is interpreted as an int
        assertEquals(197, P8.b());
    }

    @Test
    void c() {
        // 'a' = 97, 4 = 4; 97 + 4 = 101, 101 => char = 'e'
        // 'a' is interpreted as an int, so is 4. the result is
        // then cast back to a char, which is 'e'
        assertEquals('e', P8.c());
    }
}