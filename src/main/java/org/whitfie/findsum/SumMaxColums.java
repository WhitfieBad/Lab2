package org.whitfie.findsum;

public class SumMaxColums implements FindSum {

    private double[][] array;

    public SumMaxColums(double[][] array) {
        this.array = array;
    }

    @Override
    public double sum() {

        double sumColum = 0;
        double sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                sumColum += array[i][j];
            }
            if (sumMax < sumColum) {
                sumMax = sumColum;
            }
        }

        return sumMax;
    }
}
