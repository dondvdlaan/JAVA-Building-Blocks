package dev.manyroads.model;

public class Aygo extends Car {

    public String tryingToHonk() {

        return super.honk();
    }
    @Override
    public String honk(){

        return "TaaaaaaaT";
    }

    public static void main(String[] args) {
        Aygo myAygo = new Aygo();
        System.out.println(myAygo.tryingToHonk());
        System.out.println(myAygo.honk());

    }

}
