package org.whitfie.command;

import org.whitfie.array.order.ArrayOrder;
import org.whitfie.array.order.OrderGrowthMaxСolum;
import org.whitfie.array.order.ShiftEvenRows;
import org.whitfie.array.sum.ArraySum;
import org.whitfie.array.sum.SumMaxColums;
import org.whitfie.array.sum.SumMaxRows;
import org.whitfie.utils.ConsoleUtils;
import org.whitfie.utils.RandomUtils;

public class Task2 implements Command {

    @Override
    public void execute() {
        double[][] array;
        ArrayOrder arrayOrder = null;
        ArraySum arraySum = null;

        System.out.println("input rows");
        final int rows = ConsoleUtils.getUint();
        System.out.println("input colums");
        final int colums = ConsoleUtils.getUint();

        array = new double[rows][colums];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = RandomUtils.rnd(-10.51, -10.53,100);
            }
        }

        System.out.println("input variant ");

        switch (ConsoleUtils.getUint()) {
            case 1 -> {
                System.out.println("input offset");
                arrayOrder = new ShiftEvenRows(array, ConsoleUtils.getInt());
                arraySum = new SumMaxColums(array);
            }
            case 2 -> {
                arrayOrder = new OrderGrowthMaxСolum(array);
                arraySum = new SumMaxRows(array);
            }
            default -> {
                System.out.println("not found variant");
                return;
            }

        }

        arrayOrder.orderArray();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length ; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nsum -> " + arraySum.calculateSumArray());

    }
}
