package org.nstern.demos.app;

public class EnumDemo {

    public static void main(String[] args) {
        System.out.println("one".equals(Values.one.toString()));
        System.out.println(Values.one);
        System.out.println(Values.values().toString());
    }
}

enum Values{one, two, three}
