package algorithms.c1.s1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class P14Test {

    @ParameterizedTest
    @CsvSource(value = {"4,2", "5,2", "16,4", "17,4"})
    public void lg(int input, int expected) {
        assertEquals(expected, P14.lg(input));
    }

}