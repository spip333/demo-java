package org.nstern.demos.instanciation;

public class SubClass extends UpperClass{

    String text2;

/*    public SubClass() {
        System.out.println("in default constructor from SubClass");
        text2 = "default constructor from SubClass";
    }*/

    public SubClass(String s) {
        System.out.println("in constructor from SubClass");
        text2 = s;
    }
}

