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
        String phrase = "Hello human";
        String expectedPhrase = phrase;
        //: When
        String actualPhrase = dogs.speak();
        //: Then
        Assert.assertEquals("The expected out put is Hello Human.", actualPhrase,expectedPhrase);
    }

    @Test
    public void TestGetName(){
        //: Given
        String name = "george" ;
        String expectedName = "george";
        //: When
        String actualName = dogs.getName();
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }

    @Test
    public void TestSetName(){
        //: Given
        String name = "george" ;
        String expectedName = "george";
        //: When
        String actualName = dogs.setName();
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }
}
