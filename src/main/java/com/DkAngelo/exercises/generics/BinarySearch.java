package com.DkAngelo.exercises.generics;

public class BinarySearch {
    public static <T extends Comparable<T>> int find(T[] array, T key){
        int l = 0;
        int r = array.length - 1;
        while(l <= r){
            int median = (l+r)/2;
            if(array[median].compareTo(key) < 0){
                l = median + 1;
            }
            else if(array[median].compareTo(key) > 0){
                r = median - 1;
            }
            else{
                return median;
            }
        }
        return -1;
    }
}
