package io.zipcoder.pets;
import java.util.*;

/**
 * Created by rahmirford on 5/1/17.
 */
public class UserPetInput {

    int howManyPets;
    String petType;
    String petNames;
    Scanner sc = new Scanner(System.in);
    public int enterNumberOfPets(){
        System.out.print("How many pets do you have?: ");
        howManyPets = sc.nextInt();
        return howManyPets;

    }
    // Ignore case, also try to allow for multiple pet types
    public String enterPetType(){
        System.out.print("What kind of pets do you have?: ");
        petType = sc.nextLine();
        return petType.toLowerCase();
    }

    public String enterPetNames(){
        System.out.print("What are your pet(s) names?: ");
        petNames = sc.nextLine();
        return petNames.toLowerCase();
    }

}
