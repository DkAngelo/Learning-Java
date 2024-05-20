package com.DkAngelo.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Eratosthenes {
    public static Set<Integer> eratosthenes(int n) {
        Set<Integer> prime = new HashSet<>();
        for (int i = 2; i <= n; i++) {
            prime.add(i);
        }

        for(int i = 2; i <= Math.sqrt(n); i++){
            prime.removeAll(multiples(i, n));
        }
        return prime;
    }

    public static Set<Integer> multiples (int n, int limit){
        Set<Integer> multiples = new HashSet<>();
        for(int i = n+1; i <= limit; i++){
            if((i % n) == 0){
                multiples.add(i);
            }
        }
        return multiples;
    }
}
