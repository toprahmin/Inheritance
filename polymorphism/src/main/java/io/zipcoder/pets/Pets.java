package io.zipcoder.pets;

/**
 * Created by rahmirford on 5/1/17.
 */
public class Pets {

    private String name;


    public String speak(){
      String phrase = "Hello Human";
      System.out.println(phrase);
        return phrase;
    }

    public String getName(){
        return name;}

    public String setName(String name){
        this.name = name;
        return name;
    }
}
