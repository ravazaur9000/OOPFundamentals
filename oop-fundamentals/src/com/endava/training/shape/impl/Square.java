package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by admarcu on 10/26/2016.
 */
public class Square implements Shape2D {
    int x,y;
    int l;
    public Square(int l){
        this.l = l;
    }
    @Override
    public void computeArea() {
        int area = l * l;
        System.out.println("Square area: " + area);
    }

    @Override
    public void computePerimeter() {
        int perimeter = 4 * l;
        System.out.println("Square perimeter: " + perimeter);
    }
}
