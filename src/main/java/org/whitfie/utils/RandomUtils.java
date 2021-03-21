package org.whitfie.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RandomUtils {

    public static double rnd(double min, double max, int decimal){
        max -= min;
        double random = (Math.random() * ++max) + min;
        return Math.round(random * (double) decimal) / (double) decimal;
    }



}
