package org.whitfie.arrays;

import java.util.Objects;

public class CreateArray2D<E> implements FactoryArray<E>{

    @Override
    public Array<E> createArray(int... size) {
        Objects.checkIndex(size.length, 3);
        return new Array2D<>(size[0], size[1]);
    }
}
