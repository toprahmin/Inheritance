import org.junit.Test;
import io.zipcoder.pets.Pets;
import org.junit.*;
/**
 * Created by rahmirford on 5/1/17.
 */
public class TestPets {
    Pets pet;

    @Before
    public void setUp() {
        pet = new Pets();
    }

    @Test
    public void TestSpeak(){
        //: Given
        String phrase = "Hello human";
        String expectedPhrase = phrase;
        //: When
        String actualPhrase = pet.speak();
        //: Then
        Assert.assertEquals("The expected out put is Hello Human.", actualPhrase,expectedPhrase);
    }

    @Test
    public void TestGetName(){
        //: Given
        String name = "george" ;
        String expectedName = "george";
        //: When
        String actualName = pet.getName();
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }

    @Test
    public void TestSetName(){
        //: Given
        String name = "george" ;
        String expectedName = "george";
        //: When
        String actualName = pet.setName();
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }
}
