package com.DkAngelo.exercises.OOP;

import java.awt.Point;
public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    public double getArea(){
        return Math.PI*getRadius()*getRadius();
    }
    public boolean contains(Point point){
        double distance = Math.sqrt((center.getX()* center.getX()+
                                    point.getX()* point.getX()) +
                                    (center.getY()*center.getY()+
                                    point.getY()* point.getY()));
        if(radius >= distance){
            return true;
        }
        return false;
    }
    public void translate(int dx, int dy){
        Point newCenter = new Point(getCenter().x + dx, getCenter().y + dy);
        setCenter(newCenter);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
