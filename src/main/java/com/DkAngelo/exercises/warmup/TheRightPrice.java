package com.DkAngelo.exercises.warmup;

import java.util.Scanner;
import java.util.random.RandomGenerator;

public class TheRightPrice {

    public static void main (String[] args){

        RandomGenerator rnd = RandomGenerator.getDefault();
        Scanner sc = new Scanner(System.in);

        int price = rnd.nextInt(101);
        System.out.println("I have an item that has a price between 0 and 100 Euros\nUser 1, what's the right price? ");
        int firstDiff = Math.abs(price - sc.nextInt());
        System.out.println("User 2, what's the right price? ");
        int secondDiff = Math.abs(price - sc.nextInt());

        if(firstDiff < secondDiff){
            System.out.println("User 1 wins!");
        }else if(firstDiff > secondDiff){
            System.out.println("User 2 wins!");
        }else{
            System.out.println("Unbelievable, it's a tie!");
        }
        System.out.println("The right price was "+price+" Euros");
    }
}
