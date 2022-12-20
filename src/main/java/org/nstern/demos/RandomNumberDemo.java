package org.nstern.demos;

import static java.lang.Math.round;

import java.util.ArrayList;
import java.util.List;

public class RandomNumberDemo {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            var x = Math.random();
            var y = x * 6 + 1;
            var z = round(y);
            list.add(y);
        }

        int ones = 0;
        int twos = 0;
        int threes = 0;
        int fours = 0;
        int fives = 0;
        int sixes = 0;

        for (double i : list) {
            var ii = (int) i;

            switch (ii) {
                case 1:
                    ones++;
                    break;
                case 2:
                    twos++;
                    break;
                case 3:
                    threes++;
                    break;
                case 4:
                    fours++;
                    break;
                case 5:
                    fives++;
                    break;
                case 6:
                    sixes++;
                    break;
            }
        }
        int total = ones + twos + threes + fours + fives + sixes;

        var percentOnes = (float) ones / (float) total * 100;
        var percentTwos = (float) twos / (float) total * 100;
        var percentThrees = (float) threes / (float) total * 100;
        var percentFours = (float) fours / (float) total * 100;
        var percentFives = (float) fives / (float) total * 100;
        var percentSixes = (float) sixes / (float) total * 100;

        System.out.println("1 : " + ones + " : " + percentOnes + "%");
        System.out.println("2 : " + twos + " : " + percentTwos + "%");
        System.out.println("3 : " + threes + " : " + percentThrees + "%");
        System.out.println("4 : " + fours + " : " + percentFours + "%");
        System.out.println("5 : " + fives + " : " + percentFives + "%");
        System.out.println("6 : " + sixes + " : " + percentSixes + "%");


    }
}
