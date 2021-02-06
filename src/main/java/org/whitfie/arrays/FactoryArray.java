package org.whitfie.arrays;

public interface FactoryArray<T> {
    Array<T> createArray(int ...size);
}
