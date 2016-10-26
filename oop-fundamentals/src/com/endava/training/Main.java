package com.endava.training;

import com.endava.training.examples.A;
import com.endava.training.examples.B;
import com.endava.training.examples.C;
import com.endava.training.shape.impl.Circle;
import com.endava.training.shape.impl.Square;
import com.endava.training.shape.impl.Triangle;

/**
 * Created by admarcu on 10/26/2016.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Hello OOP");
        Triangle t = new Triangle(5,3,4,6);
        Circle c = new Circle(20);
        Square s = new Square(5);
        s.computeArea();
        s.computePerimeter();
        c.computeArea();
        c.computePerimeter();
        t.computeArea();
        t.computePerimeter();


        A a = new B();
        a.f();
        B b = new C();
        b.f();
        A aa=new C();
        aa.f();
    }
}
