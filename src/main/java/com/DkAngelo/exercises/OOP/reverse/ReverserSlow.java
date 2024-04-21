package com.DkAngelo.exercises.OOP.reverse;

public class ReverserSlow implements Reverser{
    @Override
    public String reverse(String s) {
        String reverseString = "";
        for(int i = 0; i < s.length(); i++){
            char charAtIndex = s.charAt(s.length() - 1 - i);
            String tmp = String.valueOf(charAtIndex);
            reverseString = reverseString.concat(tmp);
        }
        return reverseString;
    }
}
