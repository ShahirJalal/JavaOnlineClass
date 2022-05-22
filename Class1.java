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