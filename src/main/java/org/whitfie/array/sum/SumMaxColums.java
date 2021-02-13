package org.whitfie.array.sum;

public class SumMaxColums implements ArraySum {

    private double[][] array;

    public SumMaxColums(double[][] array) {
        this.array = array;
    }

    @Override
    public double sum() {

        double sumColum = 0;
        double sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            sumColum = 0;

            for (int j = 0; j < array[0].length ; j++) {
                sumColum += array[i][j];
            }

            if (sumMax < sumColum) {
                sumMax = sumColum;
            }
        }
        return sumMax;
    }
}
