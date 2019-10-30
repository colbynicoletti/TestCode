package com.company;


public class Generics {
    public static void genericDemo(){
        //Create arrays of integer, double and character
        Integer[] intArray = {1,2,3,4,5};
        Double[] doubleArray = {1.1,2.2,3.3,4.4};
        Character[] charArray = {'H','E','L','L','O'};

        System.out.println("Array integerArray contains:");
        printArray(intArray);   // pass an Integer array

        System.out.println("\nArray doubleArray contains:");
        printArray(doubleArray);   // pass a Double array

        System.out.println("\nArray characterArray contains:");
        printArray(charArray);   // pass a Character array

    }

    public static <T> void printArray(T[] array) {
        for(T i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

//    public static void printArray(Double[] array) {
//        for(Double i : array){
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }
//
//    public static void printArray(Character[] array) {
//        for(Character i : array){
//            System.out.print(i + ", ");
//        }
//        System.out.println();
//    }
}
