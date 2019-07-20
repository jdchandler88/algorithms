package algorithms.c1.s1;

import org.junit.jupiter.api.Test;

import java.util.AbstractMap;

import static org.junit.jupiter.api.Assertions.*;

public class P2Test {

    @Test
    public void a() {
        AbstractMap.SimpleImmutableEntry result = P2.a();
        assertAll(
                () -> assertEquals(1, result.getKey()),
                () -> assertEquals(Integer.class, result.getValue())
        );
    }

    @Test
    public void b() {
        AbstractMap.SimpleImmutableEntry result = P2.b();
        assertAll(
                () -> assertEquals(10.0, result.getKey()),
                () -> assertEquals(Double.class, result.getValue())
        );
    }

    @Test
    public void c() {
        AbstractMap.SimpleImmutableEntry result = P2.c();
        assertAll(
                () -> assertEquals(true, result.getKey()),
                () -> assertEquals(Boolean.class, result.getValue())
        );
    }

    @Test
    public void d() {
        AbstractMap.SimpleImmutableEntry result = P2.d();
        assertAll(
                () -> assertEquals("33", result.getKey()),
                () -> assertEquals(String.class, result.getValue())
        );
    }
}