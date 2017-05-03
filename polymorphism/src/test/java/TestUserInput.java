import io.zipcoder.pets.Polymorphism;
import io.zipcoder.pets.UserPetInput;
import org.junit.Test;
import org.junit.*;

/**
 * Created by rahmirford on 5/1/17.
 */
public class TestUserInput {

    UserPetInput up;

    @Before
    public void setUp() {
        up = new UserPetInput();
    }

    @Test
    public void TestEnterNumberOfPets() {
        //: Given
        int x = 3;
        int expectedInput = 3;
        //: When
        int actualInput = up.enterNumberOfPets();
        //: Then
        Assert.assertEquals("The expected value is 3", actualInput,expectedInput);
    }

    @Test
    public void TestEnterPetType(){
        //: Given
        String x = "Dog";
        String expectedInput = "dog";
        //: When
        String actualPetType = up.enterPetType();
        //: Then
        Assert.assertEquals(expectedInput,actualPetType);
    }

    @Test
    public void TestEnterPetNames(){
        //: Given
        String x = "Randy Harry George";
        String expectedPetNames = "randy harry george";
        //: When
        String actualPetNames = up.enterPetNames();
        //: Then
        Assert.assertEquals("The expected value of pet names is randy harry george", actualPetNames,expectedPetNames);
    }

}
