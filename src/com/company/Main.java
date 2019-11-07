package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


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

        //Anonymous Expression
        MyInterface mi1 = new MyInterface() {
            public void printIt(String text){
                System.out.println(text);
            }
        };
        mi1.printIt("Anonymous way");

        //Lambda Expression "Statement Lambda"
        MyInterface mi2 = (String text) -> {
            System.out.println(text);
        };
        mi2.printIt("Cool lambda way");

        //Can get rid of "String" word and infer the data type
        MyInterface mi3 = (text) -> {
            System.out.println(text);
        };
        mi3.printIt("Cooler way");

        //If it just needs one line of code, you can use this instead "Expression Lambda"
        MyInterface mi4 = (text) ->
            System.out.println(text);
        mi4.printIt("Coolest way");

        //Single parameter? you can omit the parentheses
        MyInterface mi5 = text ->
            System.out.println(text);
        mi5.printIt("Cooler than cool");

        //When lambda does nothing but call a method you can use a "method reference"
        MyInterface mi6 = System.out::println;
        mi6.printIt("Ice cold");

    }
}




