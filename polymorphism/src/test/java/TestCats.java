import io.zipcoder.pets.Cats;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by rahmirford on 5/7/17.
 */



    public class TestCats {
        Cats cats = new Cats();



        @Test
        public void TestSpeak(){
            //: Given

            String expectedPhrase = "Meow";
            //: When
            String actualPhrase = cats.speak();
            //: Then
            Assert.assertEquals("The expected out put is Meow.", expectedPhrase,actualPhrase);
        }

        @Test
        public void TestGetName(){
            //: Given
            String expectedName = null;
            //: When
            String actualName = cats.getName();
            //: Then
            Assert.assertEquals("The expected name is cynthia", expectedName , actualName);
        }

        @Test
        public void TestSetName(){
            //: Given
            String expectedName = null;
            //: When
            String actualName = cats.setName(null);
            //: Then
            Assert.assertEquals("The expected name is cynthia",  expectedName, actualName);
        }
    }

