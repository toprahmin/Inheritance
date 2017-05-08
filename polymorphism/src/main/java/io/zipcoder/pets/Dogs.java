package io.zipcoder.pets;

/**
 * Created by rahmirford on 5/1/17.
 */
public class Dogs extends Pets {
    private String name;


    public String getName(){
        return name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    @Override
    public String speak(){
        String phrase = "Bark Bark woof woof";
        System.out.println(phrase);
        return phrase;
    }
}
