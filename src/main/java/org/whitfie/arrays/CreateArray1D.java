package org.whitfie.arrays;

import java.util.Objects;

public class CreateArray1D<E> implements FactoryArray<E> {

    @Override
    public Array<E> createArray(int... size) {
        Objects.checkIndex(size.length, 2);
        return new Array1D<>(size[0]);
    }
}
