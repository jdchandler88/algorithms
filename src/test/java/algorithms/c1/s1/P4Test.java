package algorithms.c1.s1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P4Test {

    @ParameterizedTest
    @CsvSource(value = {"0, 0, true", "1, 1, true", "-1, 0, false", "0, -1, false", ".5, .5, true", ".5, 1.5, false", "1.5, .5, false"})
    public void isBetween0And1(double x, double y, boolean expected) {
        assertEquals(expected, P4.isBetween0And1(x, y));
    }

    @ParameterizedTest
    @CsvSource(value = {"0, true", "1, true", ".5, true", "-.5, false", "1.5, false"})
    public void isBetween0And11(double x, boolean expected) {
        assertEquals(expected, P4.isBetween0And1(x));
    }
}
