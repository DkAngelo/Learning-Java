package com.DkAngelo.exercises.warmup;

public class InterestRate {
    public static void main (String[] args){
        int balance = 1000;
        for(int i = 1; i <= 3; i++){
            balance += (5*balance/100);
            System.out.println("Year "+i+": Your balance is " + balance + " euros.");
        }
    }
}
