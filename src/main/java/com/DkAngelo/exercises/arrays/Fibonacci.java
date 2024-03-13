package com.DkAngelo.exercises.arrays;

public class Fibonacci {

    public static long[] fibonacci(int n){
        long[] f = new long[n];
        if(n >= 1) {
            f[0] = 1;
        }
        if(n >= 2){
            f[1] = 1;
            for(int i = 2; i < n; i++){
                f[i] = f[i - 1] + f[i - 2];
            }
        }
        return f;
    }

}
