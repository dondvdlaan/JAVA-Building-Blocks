package dev.manyroads.enums;

public enum EnumTest {
    vierkant(1, 2),
    grootVierkant(3, 4),
    heelGrootVierkant(5, 6);

    int lengte;
    int breedte;

    EnumTest(int lengte, int breedte) {
        this.lengte = lengte;
        this.breedte = breedte;
    }
    int oppervlakte(){
        return lengte * breedte;
    }

    public static void main(String[] args) {

        // Java knows automatically to fill in lengte and breedte by picking properties of the enum
        System.out.println(vierkant.oppervlakte());
        System.out.println(grootVierkant.oppervlakte());
    }
}
