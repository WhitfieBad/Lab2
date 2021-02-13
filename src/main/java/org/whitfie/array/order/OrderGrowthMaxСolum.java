package org.whitfie.array.order;

import java.util.Arrays;

public class OrderGrowthMaxСolum implements ArrayOrder {

    private double[][] array;

    public OrderGrowthMaxСolum(double[][] array) {
        this.array = array;
    }

    @Override
    public void orderArray() {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
    }
}
