package org.whitfie.utils;

public class RandomUtils {

    public static double rnd(double min, double max, int decimal){
        double diapason = max + Math.abs(min) + 1;
        return Math.round((Math.random() * diapason) - max * 100d) / 100d;
    }
}
