package io.codelex.oop.imperialToMetric;

public enum ConversionType {
    METERS_TO_YARDS(1.09361f),
    YARDS_TO_METERS(0.9144f),
    CENTIMETERS_TO_INCHES(0.393701f),
    INCHES_TO_CENTIMETERS(2.54f),
    KILOMETERS_TO_MILES(0.621371f),
    MILES_TO_KILOMETERS(1.60934f);
    private final float conversionType;

    ConversionType(float conversionType) {
        this.conversionType = conversionType;
    }
    public static float converter(int value, ConversionType conversionType) {
        return value * conversionType.conversionType;
    }
}
