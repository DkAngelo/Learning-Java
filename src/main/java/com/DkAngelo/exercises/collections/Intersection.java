package com.DkAngelo.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class Intersection {
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second){
        Set<Integer> res = new HashSet<>();
        for (int value : first) {
            if (second.contains(value)) {
                res.add(value);
            }
        }
        return res;
    }
}
