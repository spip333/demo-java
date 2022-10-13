package org.nstern.demos.app;

import java.util.Iterator;
import java.util.Map;

public class IterateAMapToOutputContentDemo {

    Map<String, String> params;

    public IterateAMapToOutputContentDemo (Map<String, String> params){
        this.params = params;
    }

    public static void main(String[] args) {

        Map<String, String> map = Map.of("a", "andré", "b", "bernard", "c", "christian");
        IterateAMapToOutputContentDemo demo = new IterateAMapToOutputContentDemo(map);

        demo.create1();
        demo.create2();
    }

    void create1(){

        StringBuilder output = new StringBuilder("[\n");
        for (Map.Entry<String, String> e : params.entrySet()){
            output.append("{");
            output.append(e.getKey());
            output.append(":");
            output.append(e.getValue());
            output.append("},");
            output.append("\n");
        }
        output.append("]");


        System.out.println("result:");
        System.out.println(output);
    }

    void create2(){
        StringBuilder output = new StringBuilder("[\n");
        Iterator<Map.Entry<String, String>> iterator = params.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> e = iterator.next();
            output.append("{");
            output.append(e.getKey());
            output.append(":");
            output.append(e.getValue());
            output.append("}");
            if (iterator.hasNext()){
                output.append(",");
            }
            output.append("\n");
        }
        output.append("]");
        System.out.println("result2 :");
        System.out.println(output);

    }

}
