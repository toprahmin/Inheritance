package io.zipcoder.pets;


/**
 * Created by rahmirford on 5/1/17.
 */
public class Cats extends Pets {
    String name;
    String greeting;

    @Override
    public String setName() {
        return name;
    }
    @Override
    public String speak(){
        System.out.println("Meow Bro!");
        return greeting;
    }
}
