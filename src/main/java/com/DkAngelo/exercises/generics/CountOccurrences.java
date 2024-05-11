package com.DkAngelo.exercises.generics;

public class CountOccurrences {
    public static <T> int countOccurrences(T[] src, T item){
        int occ = 0;
        if(item == null){
            for (T t : src) {
                if (t == null) {
                    occ++;
                }
            }
        }
        else {
            for (T t : src) {
                if (item.equals(t)) {
                    occ++;
                }
            }
        }
        return occ;
    }
}
