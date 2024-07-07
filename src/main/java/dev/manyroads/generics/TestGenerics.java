package dev.manyroads.generics;

public class TestGenerics <T> {

    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public void optellen(T t){

        System.out.println("Optellen: " + getT() + t);
    }

    @Override
    public String toString() {
        return "TestGenerics{" +
                "t=" + t +
                '}';
    }
}
