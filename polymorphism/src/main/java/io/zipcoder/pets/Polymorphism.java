package io.zipcoder.pets;

/**
 * Created by rahmirford on 5/1/17.
 */
public class Polymorphism{
    public static void main(String[] args){
        UserPetInput userInput = new UserPetInput();

        userInput.enterNumberOfPets();
        userInput.enterPetType();
        userInput.enterPetNames();

        System.out.println(userInput.howManyPets + " " + userInput.petType + " " + userInput.petNames);
    }
}
