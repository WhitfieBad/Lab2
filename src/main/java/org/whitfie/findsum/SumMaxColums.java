package org.whitfie.findsum;

import org.whitfie.arrays.Array;
import org.whitfie.arrays.Array2D;

public class SumMaxColums implements FindSum {

    @Override
    public double sum(Array<Double> array) {
        Array2D<Double> array2D = (Array2D<Double>)array;
        double sumColum = 0;
        double sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < array2D.getLengthMeasurement(0); i++) {
            sumColum = 0;
            for (int j = 0; j < array2D.getLengthMeasurement(1) ; j++) {
                sumColum += array2D.get(i, j);
            }
            if (sumMax < sumColum) {
                sumMax = sumColum;
            }
        }
        return sumMax;
    }
}
