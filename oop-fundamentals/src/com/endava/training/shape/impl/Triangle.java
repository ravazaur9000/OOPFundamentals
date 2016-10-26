package com.endava.training.shape.impl;

import com.endava.training.shape.Shape2D;

/**
 * Created by admarcu on 10/26/2016.
 */
public class Triangle implements Shape2D {
    int x,y;
    int a,b,c,h;
    public Triangle(int a, int b, int c, int height){
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = height;
    }
    @Override
    public void computeArea() {
        int area= (h * b) / 2;
        System.out.println("Triangle Perimeter: " + area);
    }

    @Override
    public void computePerimeter() {
        int perimeter = a + b + c;
        System.out.println("Triangle Perimeter: " + perimeter);
    }
}
