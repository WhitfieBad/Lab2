package org.whitfie.command;

import org.whitfie.array.order.*;
import org.whitfie.array.sum.*;
import org.whitfie.utils.ConsoleUtils;
import org.whitfie.utils.RandomUtils;

import java.util.Arrays;

public class Task1 implements Command {

    @Override
    public void execute() {
        double[] array;
        ArrayOrder arrayOrder = null;
        ArraySum arraySum = null;


        System.out.println("input length");
        final int length = ConsoleUtils.getUint();

        array = new double[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = RandomUtils.rnd(-10.51, 10.53, 100);
        }

        System.out.println("input variant");
        switch (ConsoleUtils.getUint()) {
            case 1 :
                arrayOrder = new OrderGrowthHalf(array);
                arraySum = new SumIndexDelThree(array);
            break;
            case 2 :
                System.out.println("input offset");
                arrayOrder = new OrderLastElementsDecrease(array, ConsoleUtils.getUint());
                arraySum = new SumPositivePairsIndex(array);
            break;
            default:
                System.out.println("not found variant");
                return;
            }

        Arrays.stream(array).forEach(x -> System.out.print(x + " "));
        System.out.println();
        try {
            arrayOrder.orderArray();
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println("не правильний диапоазон масив не отсортирован");
        }

        Arrays.stream(array).forEach(x -> System.out.print(x + " "));

        System.out.println("\nsum -> " + arraySum.calculateSumArray());

    }
}
