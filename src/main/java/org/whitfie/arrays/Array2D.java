package org.whitfie.arrays;

import org.whitfie.utils.ArrayUtils;

import java.util.Arrays;
import java.util.Collection;


public class Array2D<E> implements Array<E> {

    private Object[][] array = null;

    public Array2D(int row, int colum) {
        this.array = new Object[row][colum];
    }

    @Override
    public E get(int... index) {
        ArrayUtils.checkIndex(this, index);
        return (E) array[index[0]][index[1]];
    }

    @Override
    public void set(E element, int... index) {
        ArrayUtils.checkIndex(this, index);
        array[index[0]][index[1]] = element;
    }

    @Override
    public int getLengthMeasurement(int measurement) {
        switch (measurement) {
            case 0 : return array.length;
            case 1 : return array[0].length;
        }
        return -1;
    }
}
