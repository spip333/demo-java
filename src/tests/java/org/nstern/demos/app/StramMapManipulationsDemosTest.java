package org.nstern.demos.app;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.nstern.demos.dto.Car;

public class StramMapManipulationsDemosTest {

    StramMapManipulationsDemos sut;

    @BeforeEach
    private void init() {
        sut = new StramMapManipulationsDemos();
    }

    @Test
    void testTransform() {
        // given
        List<String> stringList = asList("111", "222", "333");
        LocalDate date = LocalDate.of(2020, 9, 1);

        // when
        Map<String, LocalDate> result = sut.transform(stringList, date);

        // then
        assertThat(result.keySet().containsAll(stringList));

        stringList.forEach(x -> assertEquals(date, result.get(x)));
    }

    @Test
    void printAll() {
        // given
        List<String> first = asList("111", "222", "333");
        List<String> second = asList("aa", "bb", "cc");

        List<List<String>> listOfList = sut.transformTwoListIntoAListOfList(first, second);

        sut.printAll(listOfList);
    }

    @Test
    void testPrintAMapOfStringToInteger() {
        Map<String, Integer> map = Map.of("11", 1, "22", 2, "33", 3);
        sut.printAMapOfStringToInteger(map);
        System.out.println(map.keySet());
    }

    @Test
    void testPrintAMapOfStringToObjects() {
        Map<String, Car> map = createCarMap();
        sut.printAMapOfStringToObjects(map);
    }

    @Test
    void shouldTransformAMapOfStringToCarIntoAList() {
        Map<String, Car> map = createCarMap();

        List<String> result = sut.transformAMapOfStringToCarIntoAList(map);

        System.out.println(result);

    }

    @Test
    void shouldTransformAMapOfStringToCarIntoAListOfEntry() {
        Map<String, Car> map = createCarMap();

        List<Map.Entry<String, Car>> result = sut.transformAMapOfStringCarIntoAlistOfEntry(map);

        System.out.println(result);


    }

    @Test
    void shouldTransformAMapOfStringToObjectsIntoAMapOfStringToStrings() {
        Map<String, Car> map = createCarMap();

        Map<String, String> result = sut.transformAMapOfStringToObjectsIntoAMapOfStringToString(map);

        System.out.println(result);
    }

    @Test
    void shouldTransformAMapOfStringToObjectsIntoAMapOfStringToList() {
        Map<String, Car> map = createCarMap();

        Map<String, List<String>> result = sut.transformAMapOfStringToObjectsIntoAMapOfStringToList(map);

        System.out.println(result);
    }

    @Test
    void shouldTransformAMapOfStringToListOfObjectsIntoAMapOfStringToList() {
        Map<String, List<Car>> map = createMapOfStringToListOfCars();

        Map<String, List<String>> result = sut.transformAMapOfStringToListOfObjectsIntoAMapOfStringToListOfString(map);

        System.out.println(result);
    }

    @Test
    void shouldTransformAListOfObjectsIntoAListOfString() {
        Map<String, Car> map = createCarMap();
        List<Car> list = new ArrayList<>(map.values());

        List<String> stringList = list.stream().map(Car::getModel).collect(Collectors.toList());

        System.out.println(stringList);

    }

    @Test
    void shouldTransformAListOfListOfObjectsIntoAListOfString() {

        Map<String, List<Car>> theMap = createMapOfStringToListOfCars();
        List<List<Car>> list = new ArrayList<>(theMap.values());

        List<List<String>> stringList =
                list.stream().map(x -> x.stream().map(Car::getModel).collect(Collectors.toList())).collect(Collectors.toList());


        System.out.println(stringList);

    }

    @Test
    void demoReduce(){
        List<String> letters = Arrays.asList("a", "a", "a" , "b", "c", "d", "e");
        String result = letters
                .stream()
                .reduce("", (partialString, element) -> partialString + element);

        assertThat(result).isEqualTo("abcde");
    }

    //@formatter:off
    private Map<String, Car> createCarMap() {
        return Map.of(
                "11",
                new Car.Builder().withPrice(222222)
                        .withMark("Ferrari")
                        .withModel("California")
                        .withOption("red")
                        .withOption("cabrio")
                        .build(),
                "22",
                new Car.Builder().withPrice(30000)
                        .withMark("Ford")
                        .withModel("smax")
                        .withOption("metallic grey")
                        .withOption("electric")
                        .build(),
                "33",
                new Car.Builder().withPrice(25000)
                        .withMark("Ford")
                        .withModel("cmax")
                        .withOption("open roof")
                        .build(),
                "44",
                new Car.Builder().withPrice(11000)
                        .withMark("Toyota")
                        .withModel("Aygo")
                        .withOption("ski bag")
                        .withOption("red")
                        .build(), "55", new Car.Builder().withPrice(32000)
                        .withMark("Toyota")
                        .withModel("Prius")
                        .withOption("stereo")
                        .withOption("gps")
                        .build());
    }

    private Map<String, List<Car>> createMapOfStringToListOfCars() {
        return Map.of(
                "11",
                asList(
                        new Car.Builder().withPrice(222222).withMark("Ferrari").withModel("California").build(),
                        new Car.Builder().withPrice(30000).withMark("Ford").withModel("smax").build()),
                "22",
                asList(
                        new Car.Builder().withPrice(25000).withMark("Ford").withModel("cmax").build(),
                        new Car.Builder().withPrice(11000).withMark("Toyota").withModel("Aygo").build()));
    }
    //@formatter:on

}
