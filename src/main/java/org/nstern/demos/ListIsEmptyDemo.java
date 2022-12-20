package org.nstern.demos;

import static org.nstern.demos.util.H.p;

import java.util.ArrayList;
import java.util.List;

public class ListIsEmptyDemo {

    public static void main(String[] args) {

        List<String> listNotInitialized;

        List<String> emptyList = new ArrayList<>();

        List<String> nullList = null;

/* WON'T COMPILE
        if (listNotInitialized.isEmpty()){
        }
*/

        try {
            if (nullList.isEmpty()) {
                p("nulllilst.isEmpty()");
            }
        } catch (Exception e) {
            p("Exception when calling nullList.isEmpty()");
        }
        try {

            if (nullList.size() == 0) {
                p("nullList.size() == 0");
            }
        } catch (Exception e) {
            p("Exception when calling nullList.size() == 0");
        }
    }
}
