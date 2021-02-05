package org.whitfie;

import org.whitfie.findsum.FindSum;
import org.whitfie.findsum.SumMaxColums;
import org.whitfie.findsum.SumIndexDelThree;

public class Lab2 {

    public static void main(String[] args) {

        double[] array = new double[]{1,2,3,4,5,6,7,7,8,8};

        double[][] array1 = new double[2][2];
        array1[0][0] = 1;
        array1[0][1] = 2;
        array1[1][0] = 3;
        array1[1][1] = 4;

        FindSum findSum = new SumMaxColums(array1);
        FindSum findSum1 = new SumIndexDelThree(array);

        System.out.println(findSum.sum());
        System.out.println(findSum1.sum());
    }
}
