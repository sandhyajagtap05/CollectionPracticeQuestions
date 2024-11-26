package com.CollectionProgram.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class PrintColor {

    public static void main(String[] args) {
        ArrayList<String> color=new ArrayList<>();

        color.add("white");
        color.add("blue");
        color.add("red");
        color.add("yellow");
        color.add("orange");
        color.add("indigo");
        color.add("violet");
        color.add("green");
        color.add("black");

        //1.Write a Java program to create an array list, add some colors (strings) and print out the collection
        System.out.println(color);

        // 2.Write a Java program to iterate through all elements in an array list
        // using for
         for(String colorIterate:color){
             System.out.println(colorIterate);
         }

         // using listiterator

       Iterator<String> l1= color.iterator();
         while(l1.hasNext()){
             System.out.println(l1.next());
         }

         // 3. Write a Java program to insert an element into the array list at the first position.

        color.add(0,"allColor");

        System.out.println(color);

        //4. Write a Java program to retrieve an element (at a specified index) from a given array list
        String colourAtIndex=color.get(4);

        System.out.println("retrieve an element at position"+" "+colourAtIndex);

       // 5.Write a Java program to update an array element by the given element.

        color.set(1,"yellow");

        System.out.println(color);

        //6.Write a Java program to remove the third element from an array list.

        color.remove(2);
        System.out.println(color);

        // 7.Write a Java program to search for an element in an array list

        System.out.println(color.contains("green"));


       //8.Write a Java program to sort a given array list.

        Collections.sort(color);
        System.out.println("after sorting"+" "+color);

       //9.Write a Java program to copy one array list into another

        ArrayList<String> anotherList=new ArrayList<>(color);

        anotherList.add("newcolor");

        System.out.println("new arraylist copy from 1st"+" "+anotherList);


        //10 Write a Java program to shuffle elements in an array list.

        System.out.println("before shuffle"+" "+anotherList);
        Collections.shuffle(anotherList);

        System.out.println("after shuffle"+" "+anotherList);

       //11.Write a Java program to reverse elements in an array list.
          Collections.reverse(anotherList);
        System.out.println("reverse elements in an array list"+" "+anotherList);

       //12.Write a Java program to extract a portion of an array list.
        System.out.println("original list:"+" "+color);
        System.out.println("subset of list:"+" "+color.subList(3,7)); //position 3 including ,position 7 not including

       //13 Write a Java program to compare two array lists.

        ArrayList<String> color1=new ArrayList<>(color);
        System.out.println("compare two array lists"+":"+color.equals(color1));
        System.out.println("compare two array lists"+":"+color.equals(anotherList));

       //14. Write a Java program that swaps two elements in an array list.

        System.out.println("before swaps"+" "+color);
//        color.set(1,"green");
        //color.set(2,"black");
        Collections.swap(color,0,1);

        System.out.println("after swaps"+" "+color);

       //15 Write a Java program to join two array lists.

        System.out.println("before join two array list"+" "+color);

        List<String> newArrayList=new ArrayList<>();

        newArrayList.add("sandhya");
        newArrayList.add("shweta");
        newArrayList.add("vaishnavi");
        newArrayList.add("gauri");
        newArrayList.add("nikita");

        color.addAll(newArrayList);

        System.out.println("after adding "+" "+color);

       //16. Write a Java program to clone an array list to another array list.

        // 1.using clone() method
        // 2.using constructor

        // 1.using clone() method
        ArrayList<Integer> OriginalList=new ArrayList<>();
        OriginalList.add(100);
        OriginalList.add(200);
        OriginalList.add(300);
        OriginalList.add(400);
        OriginalList.add(500);

        System.out.println("OriginalList is"+" "+OriginalList);

        ArrayList<Integer> clonedList= (ArrayList<Integer>) OriginalList.clone();

        System.out.println("cloned list:"+clonedList);

        // 2.using constructor

        ArrayList<Integer> clonedList2=new ArrayList<>(OriginalList);

        System.out.println("second way to clone the list"+clonedList2);

       //17. Write a Java program to empty an array list.

        System.out.println("original list:"+OriginalList);
        OriginalList.removeAll(OriginalList);
        System.out.println("empty list"+" "+OriginalList);

       //18.Write a Java program to test whether an array list is empty or not.

        System.out.println("checking arraylist is empty"+" "+OriginalList.isEmpty());

       //19.Write a Java program for trimming the capacity of an array list.
          //Trimming the capacity of an ArrayList means reducing its internal storage capacity to match the current number of elements.

        System.out.println("original list"+" "+color);
         color.trimToSize();
        System.out.println("arraylist after trimming"+" "+color.size());


       //20.Write a Java program to increase an array list size.
        ArrayList<Integer> increaseSize=new ArrayList<>();

        increaseSize.add(11);
        increaseSize.add(12);
        increaseSize.add(13);
        increaseSize.add(14);
        increaseSize.add(15);
        System.out.println("before"+increaseSize.size());

        increaseSize.ensureCapacity(2);
        increaseSize.add(16);
        increaseSize.add(17);
        // The size() method only shows the number of elements currently in the list
        System.out.println("after"+" "+increaseSize.size());

       //21. Write a Java program to replace the second element of an ArrayList with the specified element.

        System.out.println("original list"+increaseSize);

        increaseSize.set(0,1000);

        System.out.println("after replace it"+increaseSize);

       // 22 Write a Java program to print all the elements of an ArrayList using the elements' position
         // using foreach loop
        int i=0;
        for (Integer elementsWithPosition:increaseSize){
            System.out.println(i+"->"+elementsWithPosition);
            i++;
        }
        // using for loop
        for(int j=0;j<increaseSize.size();j++){
            System.out.println("position"+" "+j+" "+"value"+" "+increaseSize.get(j));
        }



    }
}

