package org.nstern.demos.instanciation;

public class Application {
    public static void main(String[] args) {


/*
        System.out.println("== sc1");
        SubClass sc1 = new SubClass();
        System.out.println(sc1.text1);
        System.out.println(sc1.text2);
*/

        System.out.println("== sc2");
        SubClass sc2 = new SubClass("sc2");
        System.out.println(sc2.text1);
        System.out.println(sc2.text2);


    }
}
