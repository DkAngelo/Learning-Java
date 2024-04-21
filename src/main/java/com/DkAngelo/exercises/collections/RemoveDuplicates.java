package com.DkAngelo.exercises.collections;

import java.util.*;

public class RemoveDuplicates {
    public static List<Integer> removeDuplicates(List<Integer> list){
        List<Integer> copy = new ArrayList<>(list);
        Set<Integer> seen = new HashSet<>();
        for(Iterator<Integer> i = copy.listIterator(); i.hasNext();){
            int value = i.next();
            if(seen.contains(value)){
                i.remove();
            }else{
                seen.add(value);
            }
        }
        return copy;
    }
}
