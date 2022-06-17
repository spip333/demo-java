package org.nstern.demos.app;

import static org.nstern.demos.util.H.p;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.nstern.demos.dto.Item;
import org.nstern.demos.dto.ItemType;

public class StreamDemoJoining {

    public static void main(String[] args) {
        // -------------------------------------
        Set<Integer> mySet = Set.of(1000, 1001, 1002, 1003);
        // code is equivalent to :
        // mySet.stream().map(el -> String.valueOf(el)).collect(Collectors.joining(","));
        String s1 = mySet.stream().map(String::valueOf).collect(Collectors.joining(", "));
        System.out.println(s1);
        // -------------------------------------
        List<String> stringList = List.of("Pierre", "Jacques", "Jean");
        // code is equivalent to :
        // String.join(", ", stringList)
        String s2 = stringList.stream().collect(Collectors.joining(", "));
        System.out.println(s2);
        String s3 = String.join(", ", stringList);
        System.out.println(s3);
        // -------------------------------------
        List<Item> itemList = Arrays.asList(
                new Item.ItemBuilder().withType(ItemType.CAMERA).withPrice(10).build(),
                new Item.ItemBuilder().withType(ItemType.CAR).withPrice(20).build(),
                new Item.ItemBuilder().withType(ItemType.BOOK).withPrice(30).build());

        System.out.println("Print List using joining : "
          + itemList.stream()
                  .map(x -> x.getType() + ":" + x.getPrice())
                  .collect(Collectors.joining("; ")));
    }
}
