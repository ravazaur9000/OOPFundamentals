package com.endava.training.examples;

/**
 * Created by admarcu on 10/26/2016.
 */
public class B extends A {
    @Override
    public void f(){
        System.out.println("Hello from B");
    }
    public void f (int x){
        System.out.println("Hello from B - 1 arg");
    }
    public void f (int x, int y){
        System.out.println("Hello from B - 2 arg");
    }
}
