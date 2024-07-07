package dev.manyroads.composition;

public class UniqueAnimalProperties {

    private String color;
    private String habitat;
    private String diet;
    private boolean isEndangered;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public boolean isEndangered() {
        return isEndangered;
    }

    public void setEndangered(boolean endangered) {
        isEndangered = endangered;
    }

    public void enDangered(){
        System.out.println("Iam endangered");
    }
}
