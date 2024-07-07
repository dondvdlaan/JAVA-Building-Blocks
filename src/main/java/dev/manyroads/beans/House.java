package dev.manyroads.beans;

public class House {

    public  enum HouseType{
        LOG, STONE, STEAL
    }
    private HouseType houseType;
    private String name;

    public House(HouseType houseType, String name) {
        this.houseType = houseType;
        this.name = name;
    }

    public HouseType getHouseType() {
        return houseType;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
