package dev.manyroads.composition;

public class AnimalPrperties {

    private int age;
    private double weight;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void poo(){
        System.out.println("Iam pooing");
    }

}
