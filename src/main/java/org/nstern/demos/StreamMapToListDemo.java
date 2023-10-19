package org.nstern.demos;

import static java.util.Arrays.asList;
import static org.nstern.demos.util.DataUtil.createListOfNames;
import static org.nstern.demos.util.DataUtil.createSampleCarList;

import java.util.List;
import java.util.Map;

import org.nstern.demos.dto.Car;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StreamMapToListDemo {
    private static final Logger log = LoggerFactory.getLogger(StreamMapToListDemo.class);

    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }

    private static void demo1() {
        log.info("demo2");
        Map<String, List<Integer>> carMap = createMap();
        List<Integer> result = carMap.get("Ferrari").stream().map(n -> 2 * n).toList();
        printResult(result);
    }

    private static void demo2() {
        log.info("demo2");
        List<String> list = createListOfNames();
        List<String> result = list.stream().map(m -> "-->" + m).toList();
        printResult(result);
    }

    private static void demo3() {
        log.info("demo3");
        List<Car> list = createSampleCarList();
        List<String> result = list.stream().map(Car::getMark).toList();
        printResult(result);
    }


    private static Map<String, List<Integer>> createMap() {
        return Map.of("Ferrari", asList(250, 280, 320), "Ford", asList(190, 215, 230), "Tesla", asList(220, 225));
    }

    private static void printResult(Object result) {
        if (log.isInfoEnabled()) {
            log.info(result.toString());
        }
    }

}




