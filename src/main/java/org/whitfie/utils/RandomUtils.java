package org.whitfie.utils;

public class RandomUtils {

    public static double rnd(double min, double max){
        double diapason = max + Math.abs(min) + 1;
        return  (Math.random() * diapason) - max;
    }
}
