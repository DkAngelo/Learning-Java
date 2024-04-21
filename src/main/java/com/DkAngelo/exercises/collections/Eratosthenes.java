package com.DkAngelo.exercises.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n){
        Set<Integer> numbers = new HashSet<>();
        for(int i = 0; i < n; i++){
            numbers.add(i);
        }
        for(Iterator<Integer> i = numbers.iterator(); i.next() != Math.sqrt(n);){
            int value = i.next();
            i.
        }
    }
}
