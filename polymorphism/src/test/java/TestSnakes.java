import io.zipcoder.pets.Snakes;
import org.junit.Assert;
import org.junit.Test;
/**
 * Created by rahmirford on 5/7/17.
 */
public class TestSnakes{

        Snakes snakes = new Snakes();


        @Test
        public void TestSpeak(){
            //: Given

            String expectedPhrase = "Sssssssssssss";
            //: When
            String actualPhrase = snakes.speak();
            //: Then
            Assert.assertEquals("The expected out put is Sssssssssssss.",expectedPhrase,actualPhrase);
        }

        @Test
        public void TestGetName(){
            //: Given
            String expectedName = null;
            //: When
            String actualName = snakes.getName();
            //: Then
            Assert.assertEquals("The expected name is sam",expectedName, actualName );
        }

        @Test
        public void TestSetName(){
            //: Given
            String expectedName = null;
            //: When
            String actualName = snakes.setName(null);
            //: Then
            Assert.assertEquals("The expected name is sam", expectedName, actualName );
        }
    }


