package org.nstern.demos;

import java.io.PrintStream;

public class OutDemo {

    private PrintStream out;

    public OutDemo(){
        out = new PrintStream(System.out);
    }

    public static void main(String[] args) {
        OutDemo outDemo = new OutDemo();
        outDemo.p1("test1");
        outDemo.p2("test2");


    }

    void p1(String name){
        out.printf("##teamcity\'[testStarted name=%s captureStandardOutput='true']%n", name);
    }
    void p2(String name){
        out.printf("##teamcity[testStarted name='%s' captureStandardOutput='true']%n", name);
    }
}
