package io.codelex.oop.imperialToMetric;

public class Conversion {
    public static void main(String[] args) {
        float fiveMToY = ConversionType.converter(5, ConversionType.METERS_TO_YARDS);
        float fiveYToM = ConversionType.converter(5, ConversionType.YARDS_TO_METERS);
        float fiveCmToIn = ConversionType.converter(5, ConversionType.CENTIMETERS_TO_INCHES);
        float fiveIntoCm = ConversionType.converter(5, ConversionType.INCHES_TO_CENTIMETERS);
        float fiveKmtoMl = ConversionType.converter(5, ConversionType.KILOMETERS_TO_MILES);
        float fiveMltoKm = ConversionType.converter(5, ConversionType.MILES_TO_KILOMETERS);


        System.out.println(fiveMToY);
        System.out.println(fiveYToM);
        System.out.println(fiveCmToIn);
        System.out.println(fiveIntoCm);
        System.out.println(fiveKmtoMl);
        System.out.println(fiveMltoKm);

    }
}
