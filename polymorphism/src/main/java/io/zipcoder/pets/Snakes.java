package io.zipcoder.pets;

/**
 * Created by rahmirford on 5/1/17.
 */
public class Snakes extends Pets{
    private String name;

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public String getName(){
        return name;
    }

    @Override
    public String speak(){
        String phrase = "Sssssssssssss";
        System.out.println(phrase);
        return phrase;
    }
}
