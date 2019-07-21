package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P9Test {

    @Test
    void toBinaryStringZero() {
        assertEquals("00000000000000000000000000000000", P9.toBinaryString(0));
    }

    @Test
    void toBinaryStringOne() {
        assertEquals("00000000000000000000000000000001", P9.toBinaryString(1));
    }

    @Test
    void toBinaryStringTwo() {
        assertEquals("00000000000000000000000000000010", P9.toBinaryString(2));
    }

    @Test
    void toBinaryStringThree() {
        assertEquals("00000000000000000000000000000011", P9.toBinaryString(3));
    }

    @Test
    void toBinaryStringFour() {
        assertEquals("00000000000000000000000000000100", P9.toBinaryString(4));
    }


}