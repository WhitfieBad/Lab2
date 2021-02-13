package org.whitfie.array.sum;

public class SumMaxRows implements  ArraySum {

    private double[][] array;

    public SumMaxRows(double[][] array) {
        this.array = array;
    }

    @Override
    public double calculateSumArray() {
        double sumRow = 0;
        double sumMax = Integer.MIN_VALUE;

        for (int i = 0; i < array[0].length; i++) {
            sumRow = 0;

            for (int j = 0; j < array.length ; j++) {
                sumRow += array[j][i];
            }

            if (sumMax < sumRow) {
                sumMax = sumRow;
            }
        }
        return sumMax;
    }
}
