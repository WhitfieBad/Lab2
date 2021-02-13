package org.whitfie.array.order;

import java.util.Arrays;

public class OrderGrowthHalf implements ArrayOrder {

    private double[] array;

    public OrderGrowthHalf(double[] array) {
        this.array = array;
    }

    @Override
    public void orderArray() {
        Arrays.sort(array,array.length / 2, array.length);
    }
}
