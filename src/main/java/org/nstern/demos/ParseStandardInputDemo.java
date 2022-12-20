package org.nstern.demos;

import java.util.Scanner;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class ParseStandardInputDemo {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("a");

        int a = in.nextInt();

        System.out.println("b");

        int b = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < a; i++) {
            String objectLine = in.nextLine();
        }
        System.out.println("c");
        int c = in.nextInt();

        System.out.println("d");
        int d = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < c; i++) {
            String gridLine = in.nextLine();
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");


        System.out.println("1");
    }
}
