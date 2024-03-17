package com.DkAngelo.exercises.OOP;

import java.util.Arrays;

public class EnhancedResizableArray {

    public static final int DEFAULT_CAPACITY = 4;
    int[] v;

    public EnhancedResizableArray() {
        this.v = new int[DEFAULT_CAPACITY];
    }

    public int get(int index){
        return v[index];
    }

    public void set(int index, int value){
        if(index >= v.length){
            v = Arrays.copyOf(v, index*2);
        }
        v[index] = value;
    }
    public boolean contains(int value){
        for(int values : v){
            if(values == value){
                return true;
            }
        }
        return false;
    }
    public void fill (int value){
        Arrays.fill(v, value);
    }
    public int[] toArray(){
        return Arrays.copyOf(v, v.length);
    }

    public int length(){
        return v.length;
    }
}
