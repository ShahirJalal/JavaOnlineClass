package com;

import java.util.ArrayList;

public class Learning {

    public static void main(String[] args) {        // instantiate variables

        // Syntax - programming grammar
        // Syntax Error -> problem grammar 
        // Logic Error -> problem business logic 

        // Primitive Datatype: String, int, boolean, float, double, Array -> Referencing
        // Datatype : String, int, boolean, Array[], etc... (Class)
        // Syntax: {Datatype} {variable_name} = {value};

        String item = "hi";

        //System.out.println(item);

        //List<> ArrayList<>
        // Syntax: ArrayList<{Datatype}> {variable_name} = new ArrayList<>();   int vs Integer
        // 
        ArrayList<Integer> arr = new ArrayList<>(); // Generic Class
        arr.add(1); // index start 0
        arr.add(2);
        arr.add(3);

        // .add() .get()

        // for ({start_value}; {conditions}; {increment})

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        if (false) { // nested if

            if (false) {

            } else {

            }
       } else if (false) {
        } else if (false) {
        } else if (false) {
        } else if (false) {
        } else if (false) {
        } else if (false) {
        } else if (false) {

        } else {

        }


        if (false) { // nested if -> elakkan: Guard clauses

            if (false) {

                if (false) {

                }

            }

        }

        // Switch
        int x = 1;
        switch (x) {
            case 1: System.out.println(); break;
            case 2: break;
            default: break;
        }



    }

}

import java.util.ArrayList;
public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        System.out.println("Test");
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);



        for (int i = 4; i >= 0; i--) {
            arr.add(i);
            System.out.println(i);
        }
    }
}