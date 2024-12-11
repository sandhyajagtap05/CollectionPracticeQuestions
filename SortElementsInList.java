package com.Collection.ListPrograms;

import java.util.*;
import java.util.stream.Collectors;

public class SortElementsInList {

    public static void main(String[] args) {


        List<String> sortedList = new ArrayList<>();

        sortedList.add("java");
        sortedList.add("sandhya");
        sortedList.add("shweta");
        sortedList.add("spring");
        sortedList.add("springboot");
        sortedList.add("hibernate");
        sortedList.add("mySql");
        sortedList.add("jagtap");
        sortedList.add("tomcat");
        sortedList.add("apigateway");
        sortedList.add("serviceregistry");
        sortedList.add("webclient");
        sortedList.add("feignclient");
        sortedList.add("microservice");
        sortedList.add("eurekaserver");
        sortedList.add("monolothic");

        Collections.sort(sortedList);

        System.out.println(sortedList);
        // using arraylist
        List<Integer> getSize=new ArrayList<>();
        for(String s:sortedList){
           getSize.add(s.length());
        }
        System.out.println(getSize);


        // using Linkedhashmap

        Map<String,Integer> usingMap=new LinkedHashMap<>();

        for(String str:sortedList){
            usingMap.put(str,str.length());
        }

        System.out.println(usingMap);


        // using stream
       List<Integer> size= sortedList.stream().map(String::length).collect(Collectors.toList());
        System.out.println(sortedList);
        System.out.println(size);
    }
}
