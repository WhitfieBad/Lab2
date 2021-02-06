package org.whitfie.command;

import org.whitfie.order.Order;
import org.whitfie.order.OrderGrowthHalf;
import org.whitfie.order.ShiftEvenRows;
import org.whitfie.sum.FindSum;
import org.whitfie.sum.SumIndexDelThree;
import org.whitfie.sum.SumMaxColums;
import org.whitfie.utils.RandomUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 implements Command {

    @Override
    public void execute() {
        double[][] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input rows");
        final int rows = scanner.nextInt();
        System.out.println("input colums");
        final int colums = scanner.nextInt();

        array = new double[rows][colums];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.round(RandomUtils.rnd(-10.51, -10.53) * 100d) / 100d;
            }
        }

        System.out.println("input offset");

        Order order = new ShiftEvenRows(array, scanner.nextInt());
        order.order();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        FindSum findSum = new SumMaxColums(array);

        System.out.println("\nsum -> " + findSum.sum());

    }
}
