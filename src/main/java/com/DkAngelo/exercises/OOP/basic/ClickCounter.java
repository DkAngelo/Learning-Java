package com.DkAngelo.exercises.OOP.basic;

public class ClickCounter {

    int value = 0;

    public ClickCounter() {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void click(){
        value++;
    }

    public void undo(){
        if(value-1 < 0) {
            return;
        }
        value--;
    }

    public void reset(){
        value = 0;
    }
}
