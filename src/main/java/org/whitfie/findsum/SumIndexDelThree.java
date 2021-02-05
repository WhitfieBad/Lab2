package org.whitfie.findsum;

public class SumIndexDelThree implements FindSum {

    private double[] array;

    public SumIndexDelThree(double[] array) {
        this.array = array;
    }

    @Override
    public double sum() {
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 3 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}
