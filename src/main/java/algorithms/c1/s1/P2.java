package algorithms.c1.s1;


import java.util.AbstractMap;

public class P2 {


    public static AbstractMap.SimpleImmutableEntry a() {
        Object value = ( 1 + 2.236 )/2;
        return new AbstractMap.SimpleImmutableEntry(value, value.getClass());
    }

    public static AbstractMap.SimpleImmutableEntry b() {
        Object value = 1 + 2 + 3 + 4.0;
        return new AbstractMap.SimpleImmutableEntry(value, value.getClass());
    }

    public static AbstractMap.SimpleImmutableEntry c() {
        Object value = 4.1 >= 4;
        return new AbstractMap.SimpleImmutableEntry(value, value.getClass());
    }

    public static AbstractMap.SimpleImmutableEntry d() {
            Object value = 1 + 2 + "3";
            return new AbstractMap.SimpleImmutableEntry(value, value.getClass());
    }

}
