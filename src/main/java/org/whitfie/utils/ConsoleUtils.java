package org.whitfie.utils;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ConsoleUtils {

    private static BufferedReader bufferedInputStream = new BufferedReader(new InputStreamReader(System.in));

    public static int getInt() {
        while (true) {
            try {
                return Integer.parseInt(bufferedInputStream.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Input integer value");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static int getUint() {
        return getIntRange(0, Integer.MAX_VALUE);
    }

    public static int getIntRange(int min, int max) {
        int value = 0;
        while (true) {
            value = getInt();
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("input  value [" + min + " " + max + "]");
        }
    }
}
