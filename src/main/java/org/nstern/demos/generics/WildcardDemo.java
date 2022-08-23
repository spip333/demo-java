package org.nstern.demos.generics;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.nstern.demos.generics.dto.Circle;
import org.nstern.demos.generics.dto.Square;

public class WildcardDemo {

    public static void main(String[] args) {

        // typedArray2Coll can be called with array of any types and coll of any types
        Square[] squares = {new Square()};
        Circle[] circles = {new Circle()};
        Shape[] shapes = {};

        List<Square> squareList = new ArrayList<>();
        List<Circle> circleList = new ArrayList<>();

        // won't  compile
        //List<? extend Shape > shapeList = new ArrayList<>();

        typedArray2Coll(squares, squareList);
        typedArray2Coll(circles, circleList);

    }

    static void array2Coll(Object[] arr, Collection<?> col) {
        System.out.println("array2Coll(Object[] arr, Collection<?> col");
        // won't compile :
        // for (Object o : arr) { col.add(o); }
    }

    static <T> void typedArray2Coll(T[] arr, Collection<T> col) {
        System.out.println("typedArray2Coll called with Object[] arr, Collection<?> col");
        // this is safe :
        for (T o : arr) {
            col.add(o);
        }
        System.out.println(col);
    }
}
