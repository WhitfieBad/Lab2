package org.whitfie;

import org.whitfie.arrays.Array;
import org.whitfie.arrays.Array1D;
import org.whitfie.arrays.Array2D;
import org.whitfie.findsum.FindSum;
import org.whitfie.findsum.SumMaxColums;
import org.whitfie.findsum.SumIndexDelThree;

public class Lab2 {

    public static void main(String[] args) {






        FindSum findSum = new SumMaxColums();
        FindSum findSum1 = new SumIndexDelThree();

        Array<Double> array = new Array1D<>(6);
        Array<Double> array1 = new Array2D(2,2);
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
