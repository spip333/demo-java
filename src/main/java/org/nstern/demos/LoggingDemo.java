package org.nstern.demos;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDemo {

    private static final Logger log = LoggerFactory.getLogger(LoggingDemo.class);

    public static void main(String[] args) {

        LoggingDemo demo = new LoggingDemo();
        demo.method1();
    }

    public void method1() {
        log.info("method1");
        MyClass myClass = new MyClass();
        myClass.myMethod();

    }

}

class MyClass {
    private static final Logger log = LoggerFactory.getLogger(MyClass.class);

    public String myMethod() {
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");

        return "myMethod";
    }
}
