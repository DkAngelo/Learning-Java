package com.DkAngelo.exercises.OOP.reverse;

import java.lang.StringBuilder;
public class ReverserFast implements Reverser{
    @Override
    public String reverse(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
