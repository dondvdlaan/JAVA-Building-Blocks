package dev.manyroads.inheritance;

public class Dog extends Animal {

    public void barking(){

        System.out.println("I am a dog and I bark");
    }

    public static void main(String[] args) {
        Dog cachi = new Dog();
        cachi.poo();
        cachi.barking();

    }
}
