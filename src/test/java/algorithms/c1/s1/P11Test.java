package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P11Test {

    //uniform
    boolean[][] input1 = {
            {true, true, false},
            {true, false, true},
            {false, true, true}
    };

    //not uniform
    boolean[][] input2 = {
            {true},
            {true, false},
            {true, false, true}
    };

    @Test
    public void testInput1() {
        String nl = System.lineSeparator();
        String expected =
                "** " + nl +
                "* *" + nl +
                " **" + nl;
        assertEquals(expected, P11.printBooleanArray(input1));
    }

    @Test
    public void testInput2() {
        String nl = System.lineSeparator();
        String expected =
                "*" + nl +
                "* " + nl +
                "* *" + nl;
        assertEquals(expected, P11.printBooleanArray(input2));
    }

}