import io.zipcoder.pets.Dogs;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rahmirford on 5/1/17.
 */


public class TestDogs {
    Dogs dogs = new Dogs();



    @Test
    public void TestSpeak(){
        //: Given

        String expectedPhrase = "Bark Bark woof woof";
        //: When
        String actualPhrase = dogs.speak();
        //: Then
        Assert.assertEquals("The expected out put is Bark Bark woof woof.", actualPhrase,expectedPhrase);
    }

    @Test
    public void TestGetName(){
        //: Given
        String expectedName = null;
        //: When
        String actualName = dogs.getName();
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }

    @Test
    public void TestSetName(){
        //: Given
        String expectedName = null;
        //: When
        String actualName = dogs.setName(null);
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }
}
