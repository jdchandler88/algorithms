package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class P18Test {

    @Test
    public void testMystery() {
        //mystery multiplies the arguments
        assertAll(
                () -> assertEquals(50, P18.mystery(2, 25)),
                () -> assertEquals(33, P18.mystery(3, 11))
        );
    }

    @Test
    public void testMystery2() {
        //not sure what this is calculating...
        assertAll(
                () -> assertEquals(96, P18.mystery2(2, 25)),
                () -> assertEquals(135, P18.mystery2(3, 11))
        );
    }

}
