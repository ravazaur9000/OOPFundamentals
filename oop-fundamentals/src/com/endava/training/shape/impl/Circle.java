package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;
import static java.lang.Math.PI;

/**
 * Created by admarcu on 10/26/2016.
 */
public class Circle implements Shape2D {
    int radius;
    int x,y;
    public Circle(int radius){
        this.radius = radius;
    }
    @Override
    public void computeArea() {
        System.out.println("Circle area: " + radius*PI);
    }

    @Override
    public void computePerimeter() {
        System.out.println("Circle perimeter: " + 2*radius*PI);
    }
}
