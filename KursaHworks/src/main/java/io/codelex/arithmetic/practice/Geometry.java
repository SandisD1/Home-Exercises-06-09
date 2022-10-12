package io.codelex.arithmetic.practice;

import io.codelex.NoCodeWrittenException;

import java.math.BigDecimal;

class Geometry {
    static double areaOfCircle(BigDecimal radius) {
        BigDecimal Pie = BigDecimal.valueOf(Math.PI);
        return radius.add(radius).multiply(Pie).doubleValue();
    }

    static double areaOfRectangle(BigDecimal length, BigDecimal width) {

        return length.multiply(width).doubleValue();
    }

    static double areaOfTriangle(BigDecimal base, BigDecimal h) {
        BigDecimal Two = BigDecimal.valueOf(2);
        return base.multiply(h).divide(Two).doubleValue();
    }
}
