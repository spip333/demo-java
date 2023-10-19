package org.nstern.demos;

import static java.util.Arrays.asList;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static org.nstern.demos.util.DataUtil.createSampleCarList;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.nstern.demos.dto.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamMapDemo {

    private static final Logger log = LoggerFactory.getLogger(StreamMapDemo.class);

    private static final List<Car> carList = createSampleCarList();


    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
        demo4();
        demo5();
        demo6();
        demo7();
    }


    private static void demo1() {
        log.info("demo1");

        Map<String, List<Car>> result = carList.stream().collect(groupingBy(Car::getMark, toList()));
        printResult(result);
    }

    private static void demo2() {
        log.info("demo2");

        List<String> result = carList.stream().map(Car::getMark).toList();
        printResult(result);
    }

    private static void demo3() {
        log.info("demo3");

        AtomicInteger counter = new AtomicInteger();

        Map<Integer, String> result = carList.stream().collect(toMap(car -> counter.getAndIncrement(), Car::getMark));
        printResult(result);
    }

    private static void demo4() {
        log.info("demo4");

        AtomicInteger counter = new AtomicInteger();

        Map<Integer, String> result = carList.stream().collect(toMap(car -> counter.getAndIncrement(), Car::getMark));
        printResult(result);
    }

    private static void demo5() {
        log.info("demo5");
        AtomicInteger counter = new AtomicInteger();

        Map<Integer, List<String>> result =
                carList.stream().collect(toMap(car -> counter.getAndIncrement(), car -> asList(car.getMark(), car.getModel())));
        printResult(result);
    }

    private static void demo6() {
        log.info("demo6");
        List<Car> result = carList.stream().map(car -> car).toList();
        printResult(result);
    }

    private static void demo7() {
        log.info("demo7");
        List<String> result = carList.stream().map(Car::getMark).toList();
        printResult(result);
    }

    private static void printResult(Object result) {
        if (log.isInfoEnabled()) {
            log.info(String.valueOf(result));
        }
    }

}
