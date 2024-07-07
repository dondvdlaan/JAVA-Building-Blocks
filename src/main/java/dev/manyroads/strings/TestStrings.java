package dev.manyroads.strings;

public class TestStrings {

    String testString = "Hola";

    public static void main(String[] args) {

        TestStrings testStrings = new TestStrings();
        String testStrin2 = testStrings.testString.replace("a","ita");
        System.out.println(testStrin2);
    }
}
