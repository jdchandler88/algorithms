package algorithms.c1.s1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P3Test {

    @ParameterizedTest
    @MethodSource("getValues")
    public void testEquals(int[] input, boolean expected) {
        assertEquals(expected, P3.equals(input));
    }

    public static Stream<Arguments> getValues() {
        return Stream.of(
                Arguments.of(new int[]{1, 1, 2}, false),
                Arguments.of(new int[]{1, 1, 1}, true),
                Arguments.of(null, false),
                Arguments.of(new int[]{}, false)
        );
    }

}
