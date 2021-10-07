package org.nstern.demos.app;


public class DemoPrimitiveInitialization {

    public static void main(String[] args){

        SimpleClass sc = new SimpleClass();

        System.out.println(sc.myVariable);

        boolean otherVariable;
        // wont'compile
        // System.out.println(otherVariable);
    }
}

class SimpleClass{
    boolean myVariable;
}
