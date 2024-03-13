package com.DkAngelo.exercises.warmup;

import java.lang.System;
import java.lang.Math;

public class EstimatePI {

    public static void main (String[] args){

        final int MAX_SIZE = 100000;
        final int MIN_SIZE = 25000;

        int inCircle = 0;

        for(int i = 1; i <= MAX_SIZE; i++){
            double x = Math.random(), y = Math.random();

            if(Math.sqrt(x * x + y * y) <= 1){
                inCircle++;
            }

            if(i % MIN_SIZE == 0){
                double estimate = (double) (4 * inCircle) / i;
                double error = (100 * (estimate - Math.PI)) / Math.PI;
                System.out.printf("[trial=%d] [error=%fpc] [estimtate=%f]\n", i, error, estimate);
            }
        }
    }
}
