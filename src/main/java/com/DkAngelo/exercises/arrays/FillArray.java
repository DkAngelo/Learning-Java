package com.DkAngelo.exercises.arrays;


import java.util.Arrays;
import java.util.random.RandomGenerator;

public class FillArray {

    public static double[] fillArray(int size, double value, boolean addNoise){
        double[] res = new double[size];
        Arrays.fill(res, value);

        if(addNoise) {
            RandomGenerator rnd = RandomGenerator.getDefault();
            for (int i = 0; i < size; i++) {
                double filler = rnd.nextDouble(value - (5 * value / 100), value + (5 * value / 100));
                res[i] = filler;
            }
        }

        return res;
    }
}
