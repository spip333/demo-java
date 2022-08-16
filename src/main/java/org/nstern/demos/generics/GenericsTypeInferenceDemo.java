package org.nstern.demos.generics;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.nstern.demos.generics.dto.Box;

public class GenericsTypeInferenceDemo {

    public static void main(String[] args) {

        List<Box<Number>> boxesWithNumber = new ArrayList<>();
        List<Box<Integer>> boxesWithInteger = new ArrayList<>();

        addBox(BigDecimal.ZERO, boxesWithNumber);

        addBox(1, boxesWithInteger);

        // won't compile
        // addBox(BigDecimal.ZERO, boxesWithInteger);

        outputBoxes(boxesWithNumber);
        outputBoxes(boxesWithInteger);

    }

    static <U> void addBox(U u, List<Box<U>> boxes) {
        Box<U> box = new Box<>();
        box.set(u);
        boxes.add(box);
    }

    static <U> void outputBoxes(java.util.List<Box<U>> boxes) {
        int counter = 0;
        for (Box<U> box : boxes) {
            U boxContents = box.get();
            System.out.println("Box #" + counter + " contains [" +
                               boxContents.toString() + "]");
            counter++;
        }
    }

}
