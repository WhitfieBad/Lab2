package org.whitfie.array.order;

import java.util.Arrays;

import java.util.Collections;


public class OrderLastElementsDecrease implements ArrayOrder {

    private double[] array;
    private int offset;

    public OrderLastElementsDecrease(double[] array, int offset) {
        this.array = array;
        this.offset = offset;
    }

    @Override
    public void order() {
       Arrays.sort(array, array.length - offset, array.length);
    }


}
