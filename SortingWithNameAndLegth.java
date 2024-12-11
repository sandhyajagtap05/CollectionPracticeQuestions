package com.Collection.ListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingWithNameAndLegth {
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

        List<String> filteredList=new ArrayList<>();
        for(String str:sortedList){
            if(str.startsWith("s")){
              filteredList.add(str);
            }
        }

        Collections.sort(filteredList, Comparator.comparingInt(String::length));

        for(String str1:filteredList){
            System.out.println(str1+" "+str1.length());
        }

    }
}
