package org.nstern.demos.app;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Car;

public class StramMapManipulationsDemos {

    public Map<String, LocalDate> transform(List<String> list, LocalDate date) {

        Map<String, LocalDate> result = list.stream().collect(Collectors.toMap(k -> k, v -> date));

        return result;
    }

    public List<List<String>> transformTwoListIntoAListOfList(List<String> list1, List<String> list2) {

        List<List<String>> list = new ArrayList<>();

        for (String x : list1) {
            List<String> tmp = new ArrayList<>();
            for (String y : list2) {
                tmp.add(x + ":" + y + " ");
            }
            list.add(tmp);
        }
        return list;
    }

    public void printAll(List<List<String>> list) {

        list.forEach(x -> x.forEach(System.out::print));
    }

    public void printAMapOfStringToInteger(Map<String, Integer> map) {
        System.out.println(map);
    }

    /**
     * prints for each map entry the key and the model of the Car object - one line per entry
     */
    public void printAMapOfStringToObjects(Map<String, Car> map) {
        map.forEach((k, v) -> System.out.println(k + ":" + v.getMark() + " "));
    }

    /**
     * prints for each map entry the key and the model of the Car object - one single line
     */
    public List<String> transformAMapOfStringToCarIntoAList(Map<String, Car> map) {
        List<String> list = new ArrayList<>();
        map.forEach((k, v) -> list.add(k + v.getMark()));
        return list;
    }

    /**
     * prints for each map entry the key and the model of the Car object - one single line
     */
    public List<Map.Entry<String,Car>> transformAMapOfStringCarIntoAlistOfEntry(Map<String, Car> carMap) {
        return new ArrayList<>(carMap.entrySet());
    }

    /**
     * transform Map<String, Car> into Map<String, String>
     */
   public Map<String,String> transformAMapOfStringToObjectsIntoAMapOfStringToString(Map<String, Car> carMap){
      return carMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getMark()));

    }

    /**
     * transform Map<String, Car> into Map<String, List<String>>
     */
    public Map<String, List<String>> transformAMapOfStringToObjectsIntoAMapOfStringToList(Map<String, Car> carMap){
        return carMap.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey, e -> e.getValue().getOptions()));
   }

    /**
     * transform Map<String, List<Car>> into Map<String, List<String>>
     */
    public Map<String, List<String>> transformAMapOfStringToListOfObjectsIntoAMapOfStringToListOfString(Map<String, List<Car>> carMap){

        Map<String, List<String>> map = carMap
                .entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,
                        e -> new ArrayList<>(e.getValue()).stream()
                        .map(Car::getModel).collect(Collectors.toList()))
                );

        return map;
    }

}
