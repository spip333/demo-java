package org.nstern.demos.app;

public class EnumDemo {

    public static void main(String[] args) {
        String one = "one";

        System.out.println("one".equals(Values.one.toString()));
        System.out.println(Values.one.toString());
        System.out.println(Values.values().toString());
    }
}

enum Values{one, two, three}
