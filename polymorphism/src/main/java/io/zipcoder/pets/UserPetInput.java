package io.zipcoder.pets;
import java.util.*;

/**
 * Created by rahmirford on 5/1/17.
 */
public class UserPetInput extends Pets {

    int howManyPets;
    String petType;
    String petNames;
    Scanner sc = new Scanner(System.in);


    public Pets petGenerator(String s) {

        switch (s) {
            case "dogs":
                return new Dogs();

            case "cats":
                return new Cats();

            case "snakes":
                return new Snakes();

            default:
                return null;
        }
    }

    public int enterNumberOfPets() {
        System.out.println("How many pets do you have");
        howManyPets = sc.nextInt();
        return howManyPets;
    }

    public ArrayList enterPetNameAndType() {
        ArrayList<Pets> petsAL = new ArrayList<Pets>();
        for (int i = 0; i < howManyPets; i++) {
            System.out.println("What kind of pet do you have?: ");
            String petName = sc.next();
            System.out.println("What is your pet's name?: ");
            String userPetType = sc.next();

            Pets p = petGenerator(userPetType);
            p.setName(petName);
            petsAL.add(p);
        }
        System.out.println(petsAL);
        return petsAL;
    }

}
