package org.whitfie.array.sum;

public class SumMaxRows implements  ArraySum {

    private double[][] array;

    public SumMaxRows(double[][] array) {
        this.array = array;
    }

    @Override
    public double sum() {
        double sumColum = 0;
        double sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < array[0].length; i++) {
            sumColum = 0;

            for (int j = 0; j < array.length ; j++) {
                sumColum += array[j][i];
            }

            if (sumMax < sumColum) {
                sumMax = sumColum;
            }
        }
        return sumMax;
    }
}
