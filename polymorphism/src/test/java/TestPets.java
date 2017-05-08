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

        String expectedPhrase = "Hello Human";
        //: When
        String actualPhrase = pet.speak();
        //: Then
        Assert.assertEquals("The expected out put is Hello Human.", expectedPhrase, actualPhrase);
    }

    @Test
    public void TestGetName(){
        //: Given
        String expectedName = null;
        //: When
        String actualName = pet.getName();
        //: Then
        Assert.assertEquals("The expected name is null", expectedName, actualName);
    }

    @Test
    public void TestSetName(){
        //: Given

        String expectedName = null;
        //: When
        String actualName = pet.setName(null);
        //: Then
        Assert.assertEquals("The expected name is george", actualName, expectedName);
    }
}
