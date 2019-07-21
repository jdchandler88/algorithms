package algorithms.c1.s1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class P9Test {

    @ParameterizedTest
    @MethodSource("getIntegers")
    public void toBinaryString(int in) {
        assertEquals(Integer.toBinaryString(in), P9.toBinaryString(in));
    }

    public static Stream<Arguments> getIntegers() {
        return IntStream.range(-1000, 1000).mapToObj(i -> Arguments.of(i));
    }

}