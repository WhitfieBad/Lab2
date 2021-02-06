package org.whitfie.arrays;

public interface Array<T> {

    T get(int ...index);

    void set(T element, int ...index);

    int getLengthMeasurement(int measurement);

}
