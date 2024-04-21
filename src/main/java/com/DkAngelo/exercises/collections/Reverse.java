package com.DkAngelo.exercises.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Reverse {
    public static List<String> reverse(List<String> sentence){
        Deque<String> sentenceDeque = new ArrayDeque<>(sentence);
        List<String> reversed = new ArrayList<>();
        while(!sentenceDeque.isEmpty()){
            reversed.addLast(sentenceDeque.pollLast());
        }
        return reversed;
    }
}
