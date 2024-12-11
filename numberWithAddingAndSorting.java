package com.Collection.ListPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class numberWithAddingAndSorting {

    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();

        l1.add(11);
        l1.add(3);
        l1.add(45);
        l1.add(5);
        //using collection

//        for(int i=0;i<l1.size();i++){
//            l1.set(i,l1.get(i)+10);
//        }
//
//        Collections.sort(l1);
//
//        System.out.println(l1);


        // using stream
        List<Integer> modifiedList=l1.stream().map(i->i+10).sorted().collect(Collectors.toList());
        System.out.println(modifiedList);
    }
}
