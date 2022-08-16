package org.nstern.demos.generics;

import org.nstern.demos.generics.dto.BoxWithNumber;

public class GenericAndInheritanceDemo {

    public static void main(String[] args) {

        BoxWithNumber<Number> boxWithNumber = new BoxWithNumber<>();
        System.out.println(boxWithNumber);
        BoxWithNumber<Integer> boxWithInteger = new BoxWithNumber<>();
        System.out.println(boxWithInteger);

        boxTest(boxWithNumber);
        // does not compile : boxTest accepts only strictly Box<Number>
        // boxTest(boxWithInteger);

        // this is ok
        boxFlexibleTest(boxWithInteger);

    }

    static void boxTest(BoxWithNumber<Number> box){
    }

    static void boxFlexibleTest(BoxWithNumber<? extends Number> box){
    }

}
