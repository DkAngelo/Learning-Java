package com.DkAngelo.exercises.OOP.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point[] vertices;
    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }
    public int getVerticesCount(){
        return vertices.length;
    }


    public double getPerimeter(){
        double perimeter = 0;
        Point o = vertices[0];
        for(int i = 1; i < getVerticesCount(); i++){
            perimeter += Math.sqrt(Math.pow(vertices[i].getX() - o.getX(), 2) +
                                   Math.pow(vertices[i].getY() - o.getY(), 2));
            o = vertices[i];
        }

        //in order to close the polygon, the first elements need to be evaluated two times
        perimeter += Math.sqrt(Math.pow(vertices[0].getX() - o.getX(), 2) +
                Math.pow(vertices[0].getY() - o.getY(), 2));

        return perimeter;
    }
    public double getArea(){
        double area = 0;
        Point o = vertices[0];
        for(int i = 1; i < getVerticesCount(); i++){
            area += (vertices[i].getX() * o.getY() - vertices[i].getY() * o.getX());
            o = vertices[i];
        }
        //in order to close the polygon, the first elements need to be evaluated two times
        area += (vertices[0].getX() * o.getY() - vertices[0].getY() * o.getX());

        return Math.abs(0.5*area);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
