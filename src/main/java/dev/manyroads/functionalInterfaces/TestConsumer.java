package dev.manyroads.functionalInterfaces;

import java.util.HashMap;
import java.util.function.BiConsumer;

public class TestConsumer {

    HashMap<String, Integer> mapje = new HashMap<>();

    BiConsumer<String, Integer> b1 = mapje::put;
    BiConsumer<String, Integer> b2 = (a, b) -> mapje.put(a, b);

    public static void main(String[] args) {
        TestConsumer testConsumer = new TestConsumer();

        testConsumer.b1.accept("aapie", 123);
        testConsumer.b2.accept("boepa", 345);

        System.out.println(testConsumer.mapje);
    }
}

