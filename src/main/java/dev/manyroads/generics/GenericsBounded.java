package dev.manyroads.generics;

public class GenericsBounded {


    public static <T > void testGeneric(String paramType, T param) {

        System.out.println("Param: " + paramType + " " + param);
        if (param instanceof Integer) {
            int i = 5;

            System.out.printf("Adding %d to int: %d totalling %n", 5, param);
        }

    }

    public static void main(String[] args) {
        GenericsBounded.testGeneric("String", "Holita");
        GenericsBounded.testGeneric("int", 123);
        GenericsBounded.testGeneric("double", 123.123);
    }
}
