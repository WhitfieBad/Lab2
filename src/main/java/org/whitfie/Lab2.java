package org.whitfie;

import org.whitfie.command.Command;
import org.whitfie.command.Task1;
import org.whitfie.command.Task2;

import java.util.Arrays;
import java.util.Collections;

public class Lab2 {

    public static void main(String[] args) {
        Command command = new Task1();
        command.execute();

        System.out.println("----------------------------------------------");

        command = new Task2();
        command.execute();
    }

}