package com.DkAngelo.exercises.collections;

import java.util.HashSet;
import java.util.Set;

public class RecurringChars {
    public static Set<Character> recurringChars(String string){
        Set<Character> seen = new HashSet<>();
        Set<Character> duplicates = new HashSet<>();
        for(int i = 0; i < string.length(); i++){
            if(!seen.contains(string.charAt(i))){
                seen.add(string.charAt(i));
            }else{
                duplicates.add(string.charAt(i));
            }
        }
        return duplicates;
    }
}
