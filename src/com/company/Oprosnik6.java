package com.company;

import java.util.HashMap;
import java.util.Map;

public class Oprosnik6 {
    public static void collectionMap(){
        Map<Integer, String> TheMap = new HashMap<>();
        TheMap.put(1,"asd");
        TheMap.put(2,"dsa");
        TheMap.put(3,"tyu");
        TheMap.put(4,"abc");
        TheMap.put(5,"oiu");
        TheMap.put(6,"abc");
        TheMap.put(7,"pzy");
        TheMap.put(8,"pRy");
        TheMap.put(9,"abc");

        TheMap.size();

        for(Map.Entry<Integer, String> entry: TheMap.entrySet()) {
            // get key
            Integer key = entry.getKey();
            if (entry.getValue() == "abc")  System.out.println(key);
            // get value
        }
    }

    public static void main(String[] args) {

        collectionMap();
    }


}
