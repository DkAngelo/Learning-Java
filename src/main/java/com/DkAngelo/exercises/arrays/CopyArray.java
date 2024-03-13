package com.DkAngelo.exercises.arrays;
public class CopyArray {
    public static double[] copyArray(double[] v){
        int len = v.length;
        double[] cp = new double[len];
        System.arraycopy(v, 0, cp, 0, len);
        return cp;
    }
}
