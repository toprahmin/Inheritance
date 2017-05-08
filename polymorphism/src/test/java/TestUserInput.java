import io.zipcoder.pets.Dogs;
import io.zipcoder.pets.Polymorphism;
import io.zipcoder.pets.UserPetInput;
import io.zipcoder.pets.Pets;
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

    // how to test scanner?
    @Test
    public void TestPetGenerator(){
        //: Given
        Dogs expected = new Dogs();
        //: When
        Pets actualPet = up.petGenerator("dogs");
        //: Then
        Assert.assertTrue(actualPet.getClass().equals(expected.getClass()));
    }

    @Test
    public void TestEnterNumberOfPets() {
        //: Given
        int expectedInput = 3;
        //: When
        int actualInput = up.enterNumberOfPets();
        //: Then
        Assert.assertEquals("The expected value is 3", actualInput,expectedInput);
    }

    @Test
    public void TestEnterPetNameAndType(){
        //: Given

        //: When

        //: Then
    }

    @Test
    public void TestRevealPetInfo(){
        //: Given

        //: When

        //: Then
    }


}
