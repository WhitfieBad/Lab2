package org.whitfie.array.sum;

public class SumPositivePairsIndex implements ArraySum {

    private double[] array;

    public SumPositivePairsIndex(double[] array) {
        this.array = array;
    }

    @Override
    public double sum() {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && array[i] >= 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
