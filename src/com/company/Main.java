package com.company;

public class Main {


    public static void main(String[] args) {
//        Plant plant1 = new Plant(); //Cannot do because it is abstract
        Generics.genericDemo();

        //Functional interface implementation through a concrete class
        Hen Henry = new Hen();
        Henry.cluck();

        //Functional interface implementation
        Chicken foghorn = new Chicken(){
            @Override
            public void cluck() {
                System.out.println("Anonymous Class");
            }
        };
    }
}




