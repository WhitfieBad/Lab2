package org.whitfie;

import org.whitfie.arrays.*;
import org.whitfie.findsum.FindSum;
import org.whitfie.findsum.SumMaxColums;
import org.whitfie.findsum.SumIndexDelThree;

public class Lab2 {

    public static void main(String[] args) {

        FindSum findSum = new SumMaxColums();
        FindSum findSum1 = new SumIndexDelThree();

        FactoryArray<Double> arrayFactory = new CreateArray1D<>();

        Array<Double> array = arrayFactory.createArray(6);
        arrayFactory = new CreateArray2D<>();
        Array<Double> array1 = arrayFactory.createArray(2,2);
        array1.set(9.0,0,0);
        array1.set(2.0,0,1);
        array1.set(3.0,1,0);
        array1.set(4.0,1,1);

        array.set(1.0, 0);
        array.set(2.0, 1);
        array.set(3.0, 2);
        array.set(4.0, 3);
        array.set(5.0, 4);
        array.set(6.0, 5);


        System.out.println(findSum1.sum(array));
        System.out.println(findSum.sum(array1));

    }
}
