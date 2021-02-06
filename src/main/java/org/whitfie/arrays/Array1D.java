package org.whitfie.arrays;


import org.whitfie.utils.ArrayUtils;

import java.util.Arrays;

public class Array1D<E> implements Array<E> {

    private Object[] array = null;

    public Array1D(int length) {
        this.array = new Object[length];
    }



    @Override
    public E get(int... index) {
        ArrayUtils.checkIndex(this, index);
        return (E) array[index[0]];
    }

    @Override
    public void set(E element, int... index) {
        ArrayUtils.checkIndex(this, index);
        array[index[0]] = element;
    }

    @Override
    public int getLengthMeasurement(int measurement) {
        switch (measurement) {
            case 0 : return array.length;
        }
        return -1;
    }
}
