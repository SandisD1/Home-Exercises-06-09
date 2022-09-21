package io.codelex.classesandobjects.practice;

public class EnergyDrinks {
    static final int NUMBERED_SURVEYED = 12467;
    static final double PURCHASED_ENERGY_DRINKS = 0.14;
    static final double PREFER_CITRUS_DRINKS = 0.64;

    public static void main(String[] args) {
        int energyDrinkers = calculateEnergyDrinkers(NUMBERED_SURVEYED, PURCHASED_ENERGY_DRINKS);
        int preferCitrus = calculatePreferCitris(energyDrinkers, PREFER_CITRUS_DRINKS);
        System.out.println("Total number of people surveyed " + NUMBERED_SURVEYED);
        System.out.println("Approximately " + energyDrinkers + " bought at least one energy drink");
        System.out.println(preferCitrus + " of those " + "prefer citrus flavored energy drinks.");
    }

    public static int calculateEnergyDrinkers(int numberSurveyed, double energyDrinkerPercent) {
        int energyDrinkers = (int) Math.round(numberSurveyed * energyDrinkerPercent);
        return energyDrinkers;
    }

    public static int calculatePreferCitris(int energyDrinkers, double preferCitrusPercent) {
        int preferCitrus = (int) Math.round(energyDrinkers * preferCitrusPercent);
        return preferCitrus;
    }
}
