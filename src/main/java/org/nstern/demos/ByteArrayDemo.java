package org.nstern.demos;

import java.nio.charset.StandardCharsets;

public class ByteArrayDemo {


    public static void main(String[] args) {
        byte[] arr = {90, 49, 48, 48, 49, 49, 52};

        String str1 = new String(arr);
        String str2 = new String(arr, StandardCharsets.UTF_8);

        System.out.println(arr);
        System.out.println(str1);
        System.out.println(str2);

    }


}
