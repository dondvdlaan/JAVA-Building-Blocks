package dev.manyroads.composition;

public class Lion {

    private final AnimalPrperties animalPrperties;
    private final UniqueAnimalProperties uniqueAnimalProperties;

    public Lion(AnimalPrperties animalPrperties, UniqueAnimalProperties uniqueAnimalProperties) {
        this.animalPrperties = animalPrperties;
        this.uniqueAnimalProperties = uniqueAnimalProperties;
    }

    public static void main(String[] args) {
        Lion leeuwtje = new Lion(new AnimalPrperties(), new UniqueAnimalProperties());

        leeuwtje.animalPrperties.poo();
    }
}
