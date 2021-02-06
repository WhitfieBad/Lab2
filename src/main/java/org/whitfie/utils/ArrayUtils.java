package org.whitfie.utils;

import org.whitfie.arrays.Array;

import java.util.Objects;

public class ArrayUtils {

    public static void checkIndex(Array array, int ...index) {
        for (int i = 0; i < index.length; i++) {
            Objects.checkIndex(index[i], array.getLengthMeasurement(i));
        }
    }

}
