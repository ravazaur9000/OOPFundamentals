package com.endava.training.examples;

/**
 * Created by admarcu on 10/26/2016.
 */
public class C extends B {
    @Override
    public void f() {
        System.out.println("Hello from C");
    }
    public void f (int x){
        System.out.println("Hello from C - 1 arg");
    }
    public void f (int x, int y){
        System.out.println("Hello from C - 2 arg");
    }
}
