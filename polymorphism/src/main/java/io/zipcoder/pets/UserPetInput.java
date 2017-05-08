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
    ArrayList<Pets> petsAL = new ArrayList<Pets>();


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

        for (int i = 0; i < howManyPets; i++) {
            System.out.println("What kind of pet do you have?: ");
            String userPetType = sc.next();
            System.out.println("What is your pet's name?: ");
            String petName = sc.next();

            Pets p = petGenerator(userPetType);
            p.setName(petName);
            petsAL.add(p);
        }
        return petsAL;
    }
    public void revealPetInfo(){
        for(Pets p: petsAL){
            System.out.println(p.getName() + " " + p.speak());
        }
    }

}
