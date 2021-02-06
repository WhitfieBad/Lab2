package org.whitfie.findsum;

import org.whitfie.arrays.Array;

public class SumIndexDelThree implements FindSum {

    @Override
    public double sum(Array<Double> array) {
        double sum = 0;

        for (int i = 0; i < array.getLengthMeasurement(0); i++) {
            if (i % 3 == 0) {
                sum += array.get(0);
            }
        }
        return sum;
    }
}
