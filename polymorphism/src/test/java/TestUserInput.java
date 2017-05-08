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
        Pets expected =
        //: When

        //: Then
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


}
