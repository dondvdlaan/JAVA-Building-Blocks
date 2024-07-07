package dev.manyroads.functionalInterfaces;

import java.util.function.BiFunction;

public class TestBiFuntion {
    BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;
    BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;

    public static void main(String... args) {

        TestBiFuntion calculator = new TestBiFuntion();

        System.out.println("40 + 2 = " +
                calculator.operateBinary(40, 2, (a, b) -> a + b));
        System.out.println("20 - 10 = " +
                calculator.operateBinary(20, 10, calculator.subtraction));
    }

    public <T> T operateBinary(T a, T b, BiFunction<T, T, T> op) {
        return op.apply(a, b);
    }
    /*public int operateBinary(int a, int b, BiFunction<Integer, Integer, Integer> op) {
        return op.apply(a, b);
    }

     */


}
