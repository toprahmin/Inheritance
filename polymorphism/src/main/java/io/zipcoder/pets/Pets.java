package io.zipcoder.pets;

import java.util.Scanner;

/**
 * Created by rahmirford on 5/1/17.
 */
public class Pets {

    private String name;
    //private String greeting;

    public String speak(){
      String greeting = "Hello Human";
      return greeting;
    }

    public String getName(){return name;}

    public String setName(){
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        return name;
    }
}
