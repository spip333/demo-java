package org.nstern.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Consumer {


    public static void main(String[] args) {
        Consumer consumer = new Consumer();
        consumer.consume();
    }

    public void consume() {
        try {
            Future<Integer> future = new SquareCalculator().calculate(10);
            while (!future.isDone()) {
                System.out.println("Calculating...");
                Thread.sleep(250);
            }
            Integer result = future.get();
            System.out.println("resultat : " + result);
            Integer result2 = future.get();
            System.out.println("resultat2 : " + result2);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
