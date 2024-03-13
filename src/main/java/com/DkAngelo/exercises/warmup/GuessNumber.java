package com.DkAngelo.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class GuessNumber {

    public static void main (String[] s){

        RandomGenerator rnd = RandomGenerator.getDefault();
        int computerNum, scanned;

        do {
            computerNum = rnd.nextInt(0, 4);
            System.out.println("Type in your guess between 0 and 3: ");
            Scanner sc = new Scanner(System.in);
            scanned = sc.nextInt();
            if(scanned == computerNum) {
                System.out.println("You guessed right!");
            }
            else {
                System.out.println("LOL your guess is wrong, retry");
            }
        }while((scanned != computerNum) && computerNum!=0);

        System.out.println("You were a worth opponent, goodbye!");
    }
}
