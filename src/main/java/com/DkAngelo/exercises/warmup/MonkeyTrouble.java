package com.DkAngelo.exercises.warmup;

import java.util.Scanner;
import java.lang.System;
public class MonkeyTrouble {

    public static void main (String[] args) {

        boolean aSmile, bSmile;
        Scanner sc = new Scanner(System.in);

        System.out.println("Look at those two monkeys!\nIs the first monkey smilin'? (y/n) ");
        String firstIn = sc.next();
        aSmile = firstIn.compareToIgnoreCase("y") == 0;

        System.out.println("Is the second monkey smilin'? (y/n)");
        String secondIn = sc.next();
        bSmile = secondIn.compareToIgnoreCase("y") == 0;

        if ((aSmile && bSmile) || (!aSmile && !bSmile)) {
            System.out.println("RUN, WE ARE IN TROUBLE!");
        }
        else{
            System.out.println("Alright, we can have fun with them!");
        }
    }
}
