package com.DkAngelo.exercises.OOP;

import com.DkAngelo.exercises.OOP.basic.Polygon;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolygonTest {
    public static final double DELTA = 1e-06;
    com.DkAngelo.exercises.OOP.basic.Polygon square;
    com.DkAngelo.exercises.OOP.basic.Polygon triangle;
    @BeforeEach
    void setUp() {
        square = new com.DkAngelo.exercises.OOP.basic.Polygon(new Point[]{new Point(0,0), new Point(0, 10), new Point(10,10), new Point(10, 0)});
        triangle = new Polygon(new Point[]{new Point(0,0), new Point(10, 0), new Point(5,10)});
    }

    @Test
    void getVerticesCount() {
        assertEquals(4, square.getVerticesCount());
        assertEquals(3, triangle.getVerticesCount());
    }

    @Test
    void getPerimeter() {
        assertEquals(40, square.getPerimeter(), DELTA);
        assertEquals(32.3606797749979, triangle.getPerimeter(), DELTA);
    }

    @Test
    void getArea() {
        assertEquals(100, square.getArea(), DELTA);
        assertEquals(50, triangle.getArea(), DELTA);
    }
}