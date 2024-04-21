package com.DkAngelo.exercises.collections;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SpeedTestTest {

    final int times = 100000;
    @Test
    void insertBeginning() {
        long timeArrayList = SpeedTest.insertBeginning((new ArrayList<>()), "Item", times);
        long timeLinkedList = SpeedTest.insertBeginning((new LinkedList<>()), "Item", times);
        assertTrue(timeLinkedList < timeArrayList);
    }

    @Test
    void insertEnd() {
        long timeArrayList = SpeedTest.insertEnd((new ArrayList<>()), "Item", times);
        long timeLinkedList = SpeedTest.insertEnd((new LinkedList<>()), "Item", times);
        assertTrue(timeArrayList < timeLinkedList);
    }
}