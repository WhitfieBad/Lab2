package org.whitfie.array.order;

import java.util.Arrays;
import java.util.Collections;

public class ShiftEvenRows implements ArrayOrder {

    private int offset;
    private double[][] array;

    public ShiftEvenRows(double[][] array, int offset) {
        this.offset = offset;
        this.array = array;
    }

    @Override
    public void orderArray() {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                leftRotate(array[i], offset);
            }
        }
    }

    private static void leftRotate(double[] arr, int offset) {
        Double[] array = new Double[arr.length];

        for (int i = 0; i < arr.length; i++) {
            array[i] = arr[i];
        }

        Collections.rotate(Arrays.asList(array), offset);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = array[i];
        }
    }

}
