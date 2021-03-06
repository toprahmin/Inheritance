import java.util.ArrayList;

/**
 * Created by rahmirford on 5/1/17.
 *
 * Create a class that subclasses the built-in List class.
 *  Write a function that rotates a list by k elements.
 *  For example [1,2,3,4,5,6] rotated by two becomes [3,4,5,6,1,2].
 *  Try solving this without creating a copy of the list.
 *  How many swap or move operations do you need?
 */
public class Main {
    public static void main (String[] args) {
        Rotary arrayList = new Rotary();
        arrayList.randomArrayGenerator();
        System.out.println(arrayList.toString());

        arrayList.rotateArray(5);
        System.out.println(arrayList.toString());

    }
}
