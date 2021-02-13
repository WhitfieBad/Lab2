package org.whitfie.array.order;

import java.util.Arrays;

public class OrderGrowthMaxElement implements ArrayOrder {

    private double[][] array;

    public OrderGrowthMaxElement(double[][] array) {
        this.array = array;
    }

    @Override
    public void order() {
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
        }
    }
}
