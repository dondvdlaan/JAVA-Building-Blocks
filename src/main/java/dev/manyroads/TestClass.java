package dev.manyroads;

public class TestClass {


    public static void main(String[] args) {

        System.out.println("before return");
        if(false) return;
        System.out.println("after return");
    }
}
