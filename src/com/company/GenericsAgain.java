package com.company;

import java.util.ArrayList;

public class GenericsAgain {
  public static void genericDemo2() {

//    ArrayList myList = new ArrayList();
//    myList.add(1);
//    myList.add(1.1);
//    myList.add('H');

    ArrayList<String> myList = new ArrayList<String>();
    myList.add("Hello");
    System.out.println(myList.get(3).substring(2));

    // Create arrays of Integer, Double and Character
    Integer[] intArray = { 1, 2, 3, 4, 5 };
    Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
    Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

    System.out.println("Array integerArray contains:");
    printArray2(intArray);   // pass an Integer array

    System.out.println("\nArray doubleArray contains:");
    printArray2(doubleArray);   // pass a Double array

    System.out.println("\nArray characterArray contains:");
    printArray2(charArray);   // pass a Character array
  }

  //Example of Generics
  //This method utilizes generics
  private static <T> void printArray2(T[] array){
    for(T i: array){
      System.out.println(i + " ");
    }
    System.out.println();

  }
}


