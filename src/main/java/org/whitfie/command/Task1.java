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
            array[i] = Math.round(RandomUtils.rnd(-10.51, -10.53) * 100d) / 100d;
        }

        System.out.println("input variant");
        switch (ConsoleUtils.getUint()) {
            case 1 -> {
                arrayOrder = new OrderGrowthHalf(array);
                arraySum = new SumIndexDelThree(array);
            }
            case 2 -> {
                System.out.println("input offset");
                arrayOrder = new OrderLastElementsDecrease(array, ConsoleUtils.getIntRange(0,array.length));
                arraySum = new SumPositivePairsIndex(array);
            }
            default -> {
                System.out.println("not found variant");
                return;
            }
        }

        arrayOrder.order();

        Arrays.stream(array).forEach(x -> System.out.print(x + " "));

        System.out.println("\nsum -> " + arraySum.sum());

    }
}
