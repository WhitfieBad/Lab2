package org.whitfie.utils;


import java.util.Scanner;

public class ConsoleUtils {

    private static Scanner scanner = new Scanner(System.in);

    public static int getInt() {
        while (true) {
            try {
                return Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Input integer value");
            }
        }
    }

    public static int getUint() {
        return Math.abs(getInt());
    }

}
