package org.whitfie.command;

import org.whitfie.order.Order;
import org.whitfie.order.OrderGrowthHalf;
import org.whitfie.sum.FindSum;
import org.whitfie.sum.SumIndexDelThree;
import org.whitfie.utils.RandomUtils;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 implements Command {

    @Override
    public void execute() {
        double[] array;
        Scanner scanner = new Scanner(System.in);

        System.out.println("input length");
        final int length = scanner.nextInt();

        array = new double[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Math.round(RandomUtils.rnd(-10.51, -10.53) * 100d) / 100d;
        }

        Order order = new OrderGrowthHalf(array);
        order.order();

        Arrays.stream(array).forEach(x -> System.out.print(x + " "));

        FindSum findSum = new SumIndexDelThree(array);

        System.out.println("\nsum -> " + findSum.sum());

    }
}
