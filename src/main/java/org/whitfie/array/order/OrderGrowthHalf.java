package org.whitfie.array.order;

import java.util.Arrays;

public class OrderGrowthHalf implements ArrayOrder {

    private double[] array;

    public OrderGrowthHalf(double[] array) {
        this.array = array;
    }

    @Override
    public void order() {
        double[] sortedArray = Arrays.stream(array).limit(array.length / 2).sorted().toArray();
        for (int i = 0; i < array.length / 2; i++) {
            array[i] = sortedArray[i];
        }
    }
}
