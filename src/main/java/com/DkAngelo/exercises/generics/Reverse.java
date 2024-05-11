package com.DkAngelo.exercises.generics;

import java.util.ArrayList;
import java.util.List;

public class Reverse {
    public static <T> void reverse(List<T> list){
       for(int i = 0; i < list.size()/2; i++){
           T temp = list.get(i);
           list.set(i, list.get(list.size()-1-i));
           list.set(list.size()-1-i, temp);
       }
    }
}
