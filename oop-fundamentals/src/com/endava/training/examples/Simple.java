package com.endava.training.examples;

import javax.lang.model.util.SimpleElementVisitor6;

/**
 * Created by admarcu on 10/26/2016.
 */
public class Simple {
    int i;

    Simple(int i){
        i=5;
    }
}

class ExendedSimple extends Simple{
    ExendedSimple (){
        super(5);
        System.out.println("Hello from constructor with 0 args");
    }
    ExendedSimple (int a){
        super(5);
        System.out.println("Hello from constructor with 1 args");
    }
    ExendedSimple (int a, int b){
        super(5);
        System.out.println("Hello from constructor with 2 args");
    }
}
