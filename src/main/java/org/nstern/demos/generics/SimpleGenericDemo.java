package org.nstern.demos.generics;

import java.awt.Shape;
import java.util.ArrayList;
import java.util.List;

import org.nstern.demos.generics.dto.Circle;
import org.nstern.demos.generics.dto.Square;

public class SimpleGenericDemo {

    public static void main(String[] args) {

        List<Square> squareList = new ArrayList<>();

        // won't compile : List<Square> is NOT a subclass of List<Shape>
        // List<Shape> shapeList = squareList;

        // this is safe
        List<?> myList = squareList;

        // won't compile :
        // myList.add(new Object());

        // this is safe :
        List<Shape> shapeList = new ArrayList<>();
        printAllStrict(shapeList);

        // won't compile : required is a list containing strictly Shapes!
        //  printAllStrict(squareList);

        // this is safe :
        // printAllTypesOfShape expects a List<? extends Shape> arg, and shapeList is compliant)
        printAllTypesOfShape(shapeList);

        // this won't compile , WHY?
        // printAllTypesOfShape(squareList);
        // according to https://docs.oracle.com/javase/tutorial/extra/generics/wildcards.html, it should
        // see also : https://www.baeldung.com/java-generics

    }

    static void printAllStrict(List<Shape> shapeList) {
        System.out.println("printAllStrict called with List<Shape>");
    }

    static void printAllTypesOfShape(List<? extends Shape> shapeList) {
        System.out.println("printAllStrict called with List<? extends Shape>");
    }


}
