package com.DkAngelo.exercises.arrays;

public class DivideArray {

    public static double[] divideArray(double[] v, double factor){
        double[] res = new double[v.length];
        for(int i = 0; i < v.length; i++){
            res[i] = v[i]/factor;
        }
        return res;
    }
}
