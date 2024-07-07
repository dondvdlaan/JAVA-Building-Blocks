package dev.manyroads.beans;

public class Plot {

    double areaPlot;
    String houseName;

    public Plot(double areaPlot) {
        this.areaPlot = areaPlot;
    }

    public Plot(double areaPlot, String houseName) {
        this.areaPlot = areaPlot;
        this.houseName = houseName;
    }

    public double getAreaPlot() {
        return areaPlot;
    }
}
