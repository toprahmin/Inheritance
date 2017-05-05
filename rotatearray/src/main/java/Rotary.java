import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

/**
 * Created by rahmir ford on 5/4/17.
 */

public class Rotary extends ArrayList {

    public void randomArrayGenerator(){

        for(int i = 0; i < 10; i++){
            this.add((int) (Math.random() * 10));
        }
    }

    public void rotateArray(int k){
        for (int i = 0; i < k; i++){
            this.add(this.size(),  this.get(0));
            this.remove(0);
        }
    }

    // Create a method that rotates an array




}
