package org.nstern.demos.generics.dto;

public class Box<T> {
    T number;

    public void set(T t){
        number = t;
    }

    public T get(){
        return number;
    }
}
