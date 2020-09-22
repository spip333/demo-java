package org.nstern.demos.exceptions;

public class DemoBusinessException extends RuntimeException {
    public DemoBusinessException(){
        super();
    }

    public DemoBusinessException(String s){
        super(s);
    }
}
