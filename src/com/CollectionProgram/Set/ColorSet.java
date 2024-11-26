package com.CollectionProgram.Set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class ColorSet {


    public static void main(String[] args) {


        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);
        numbers.add(15);

        System.out.println(numbers);

        // 1. Write a Java program to append the specified element to the end of a hash set.

        numbers.add(17);

        System.out.println(numbers);

        //2. Write a Java program to iterate through all elements in a hash list.

        for(int s1:numbers){
            System.out.println(s1);
        }

        //using iterator

        Iterator l1=numbers.iterator();
        while(l1.hasNext()){
            System.out.println(l1.next());
        }

        // 3.Write a Java program to get the number of elements in a hash set.

        System.out.println("numbers of hashset"+" "+numbers);
        System.out.println("number of element"+" "+numbers.size());

        //4 Write a Java program to empty an hash set.
        numbers.clear();
        System.out.println("empty set:"+numbers);

        //5 Write a Java program to test if a hash set is empty or not.

        System.out.println(numbers.isEmpty());

        // 6 Write a Java program to clone a hash set to another hash set.

        HashSet<Integer> originalSet=new HashSet<>();
        originalSet.add(100);
        originalSet.add(200);
        originalSet.add(300);
        originalSet.add(400);
        originalSet.add(500);

        System.out.println("before clone"+" "+originalSet);

        HashSet<Integer> clonedSet= (HashSet<Integer>) originalSet.clone();

        System.out.println("after clone"+" "+clonedSet);

        // using constructor

        HashSet<Integer> newHashSet=new HashSet<>(originalSet);
        System.out.println("new hashset using constructor"+" "+newHashSet);


        //7.Write a Java program to convert a hash set to an array.

//        Integer[] newArray=newHashSet.toArray(new Integer[0]); //toArray()method is used for converting set to array
//        for(Integer i1:newArray){
//            System.out.println(i1);
//        }
        Object[] o1=newHashSet.toArray();
        for(Object i1:o1){
            System.out.println(i1);
        }

        //8 Write a Java program to convert a hash set to a tree set.


        System.out.println("originalSet"+" "+originalSet);
        TreeSet treeSet=new TreeSet<>(originalSet);
        System.out.println("converting hash set into tree set"+" "+treeSet);

        //9 Write a Java program to find numbers less than 400 in a tree set

        System.out.println("originalSet"+" "+originalSet);
        TreeSet lessThan400= (TreeSet) treeSet.headSet(400);
        System.out.println(" treeset lessThan400"+" "+lessThan400);

        // greater then
        TreeSet greaterThan200= (TreeSet) treeSet.tailSet(200);
        System.out.println("greaterThan200"+" "+greaterThan200);

        //11. Write a Java program to compare two sets and retain elements that are the same.

        System.out.println("originalSet"+" "+originalSet);

        HashSet<Integer> originalSet2=new HashSet<>();
        originalSet2.add(400);
        originalSet2.add(200);
        originalSet2.add(700);
        originalSet2.add(900);
        originalSet2.add(800);

        System.out.println("originalSet2"+" "+originalSet2);
        originalSet.retainAll(originalSet2);  // retainAll means  return same element from both set
        System.out.println(originalSet);


        //10 Write a Java program to compare two hash set.
        System.out.println("comparing two set"+" "+originalSet.equals(originalSet2));

        //12 Write a Java program to remove all elements from a hash set.

        HashSet<Integer> originalSet3=new HashSet<>();
        originalSet3.add(1234);
        originalSet3.add(5678);
        originalSet3.add(9876);
        originalSet3.add(2097);
        originalSet3.add(8000);

        System.out.println("original list "+" "+originalSet3);

        System.out.println(originalSet3.removeAll(originalSet3));

        System.out.println(originalSet3);
    }
}
