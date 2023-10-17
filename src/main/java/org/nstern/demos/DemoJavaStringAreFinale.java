package org.nstern.demos;

public class DemoJavaStringAreFinale {

    public static void main(String[] args) {

        String notFinalString = "not final String";
        final String finalString = "final String";

        // does not compile
        // finalString = "try to change";

        notFinalString = "hello";

        System.out.println(notFinalString);

        String x  = changeString(finalString);
        System.out.println(finalString);



    }

    static String changeString(String s){
        s = "Changed!";
        return s;
    }
}
