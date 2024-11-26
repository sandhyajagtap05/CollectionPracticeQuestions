package com.CollectionProgram.Map;

import java.util.*;

public class NameWithId {

    public static void main(String[] args) {
    //1. Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<Integer,String> m1=new HashMap<>();
        m1.put(1,"spring");
        m1.put(2,"springBoot");
        m1.put(3,"bean");
        m1.put(4,"ioc");
        m1.put(5,"spring");
        m1.put(6,"java");

        System.out.println(m1);

        for(Map.Entry<Integer,String> m2:m1.entrySet()){
            System.out.println(m2);
        }
    // 2.Write a Java program to count the number of key-value (size) mappings in a map

        System.out.println("count key-value of map"+" "+m1.size());

        //3.Write a Java program to copy all mappings from the specified map to another map

        // using clone method
        HashMap<Integer,String> cloneMap= (HashMap<Integer, String>) m1.clone();

        System.out.println(cloneMap);
        cloneMap.put(7,"hibernate");
        System.out.println(cloneMap);

        //using constructor
        HashMap<Integer,String> m2=new HashMap<>(m1);
        System.out.println("second way to clone"+" "+m2);


        //4. Write a Java program to remove all mappings from a map.


        System.out.println("before remove"+" "+m2);

        m2.clear();
        System.out.println("after remove"+" "+m2);

        //5.Write a Java program to check whether a map contains key-value mappings (empty) or not.

        m1.isEmpty();
        System.out.println( "map is empty"+" "+m1.isEmpty());

        //6Write a Java program to get a shallow copy of a HashMap instance.

        HashMap<Integer,String> shallowCopy= (HashMap<Integer, String>) m1.clone(); // shallowCopy means clone
        System.out.println("shallowCopy of map"+" "+shallowCopy);

        //7Write a Java program to test if a map contains a mapping for the specified key

//        m1.containsKey(1);
        System.out.println(m1);
        System.out.println(m1.containsKey(1));

        // 8 Write a Java program to test if a map contains a mapping for the specified value

        System.out.println(m1);
        System.out.println(m1.containsValue("java"));

        //9 Write a Java program to create a set view of the mappings contained in a map.
        Set<Map.Entry<Integer,String>> setView=m1.entrySet();
        System.out.println("set view of map"+" "+setView);

        //10 Write a Java program to get the value of a specified key in a map.
        HashMap<Integer,String> m12=new HashMap<>();
        m12.put(1,"spring");
        m12.put(2,"springBoot");
        m12.put(3,"bean");
        m12.put(4,"ioc");
        m12.put(5,"spring");
        m12.put(6,"java");

        //int keyToFind = 2;
        String value = m12.get(2);
        System.out.println("value for perticular key"+" "+value);

        //11 Write a Java program to get a set view of the keys contained in this map.

       Set<Integer> View=m12.keySet();
        System.out.println("set view of keys"+" "+View);

        //12. Write a Java program to get a collection view of the values contained in this map.

        Collection<String> collection=m12.values();
        System.out.println("collection view of the values"+collection);
    }
}
